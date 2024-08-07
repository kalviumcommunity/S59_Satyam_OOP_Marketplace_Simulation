package com.marketplace.users;

public class Customer {
    private String name;
    private static int customerCount =0;

    public Customer(String name) {
        this.name = name;
        customerCount++;
    }


}
