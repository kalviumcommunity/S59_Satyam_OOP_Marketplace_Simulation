package com.marketplace.products;

public class Product {
    private String serialNo;
    private String name;
    private double price;
    private int quantity;
    private String description;

    public String getSerialNo() {
        return serialNo;
    }

    public String name(){
        return name;
    }

    public double price(){
        return price;
    }

    public int quantity(){
        return quantity;
    }

    public String description(){
        return description;
    }

    public void displayDetails(){
        System.out.println("Serial No: " + serialNo);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Description: " + description);
    }
}

