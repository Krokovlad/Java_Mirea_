package com.company;

public final class Employee extends AbstractPerson {
    final String department;
    final PositionEnum position;

    public Employee(String name, String department, PositionEnum position) {
        super(name);
        this.department = department;
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public PositionEnum getPosition() {
        return position;
    }

    @Override
    public String think() {
        return "I want to sell higher";
    }
}
