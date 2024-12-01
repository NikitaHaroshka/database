package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Табличные данные");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Doe", 28));
        people.add(new Person("Jane", "Smith", 34));
        people.add(new Person("Sam", "Brown", 21));

        PersonTableModel tableModel = new PersonTableModel(people);

        JTable table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow();
            window.setVisible(true);
        });
    }
}
