package com.marketplace.users;

public class Employee extends User {
    private static int employeeCount = 0;

    public Employee(String name) {
        super(name);
        employeeCount++;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Employee");
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }
}
