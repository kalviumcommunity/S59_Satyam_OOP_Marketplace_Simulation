package com.marketplace.users;

public class Employee {
    private String employeeName;
    private static int employeeCount = 0;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
        employeeCount++;
    }

    // Accessor (Getter)
    public String getEmployeeName() {
        return employeeName;
    }

    // Mutator (Setter)
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Accessor (Getter) for employeeCount
    public static int getEmployeeCount() {
        return employeeCount;
    }
}
