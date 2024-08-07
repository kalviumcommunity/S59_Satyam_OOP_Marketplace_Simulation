package com.marketplace.users;

public class Employee {
    private String employeeName;
    private static int employeeCount=0;


    public Employee(String employeeName) {
        this.employeeName=employeeName;
        employeeCount++;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public String getEmployeeName() {
        return employeeName;
    }





}
