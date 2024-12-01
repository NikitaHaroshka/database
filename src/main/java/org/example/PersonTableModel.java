package org.example;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PersonTableModel extends AbstractTableModel {
    private List<Person> people;
    private String[] columnNames = {"First Name", "Last Name", "Age"};

    public PersonTableModel(List<Person> people) {
        this.people = people;
    }

    @Override
    public int getRowCount() {
        return people.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Person person = people.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return person.getFirstName();
            case 1:
                return person.getLastName();
            case 2:
                return person.getAge();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
}
