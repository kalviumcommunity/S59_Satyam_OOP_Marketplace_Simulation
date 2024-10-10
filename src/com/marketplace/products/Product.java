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

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void updateQuantity(int additionalQuantity) {
        this.quantity += additionalQuantity;
    }

    public void displayDetails() {
        System.out.println("------------------------");
        System.out.println("Serial No: " + serialNo);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Description: " + description);
        System.out.println("------------------------");
    }

    // Default constructor
    public Product() {
        this.serialNo = "defaultSerial";
        this.name = "defaultName";
        this.price = 0.0;
        this.quantity = 0;
        this.description = "No description";
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public Product(String serialNo, String name, double price, int quantity, String description) {
        this.serialNo = serialNo;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        System.out.println("Parameterized constructor called");
    }

    // Another overloaded constructor for a Product with no quantity and description
    public Product(String serialNo, String name, double price) {
        this.serialNo = serialNo;
        this.name = name;
        this.price = price;
        this.quantity = 0; // Default quantity
        this.description = "No description provided"; // Default description
        System.out.println("Overloaded constructor with 3 parameters called");
    }
}
