package com.marketplace.users;

public class Customer {
    private String name;
    private static int customerCount = 0;

    public Customer(String name) {
        this.name = name;
        customerCount++;
    }

    // Accessor (Getter)
    public String getName() {
        return name;
    }

    // Mutator (Setter)
    public void setName(String name) {
        this.name = name;
    }

    // Accessor (Getter) for customerCount
    public static int getCustomerCount() {
        return customerCount;
    }
}
