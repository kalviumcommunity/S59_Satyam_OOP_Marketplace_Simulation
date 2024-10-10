package com.marketplace.users;

public class Customer extends User {
    private static int customerCount = 0;

    public Customer(String name) {
        super(name);
        customerCount++;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Customer");
    }

    public static int getCustomerCount() {
        return customerCount;
    }
}
