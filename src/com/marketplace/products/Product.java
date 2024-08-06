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

    public String name(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double price(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int quantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String description(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void updateQuantity(int additionalQuantity) {
        this.quantity += additionalQuantity;
    }


    public void displayDetails(){
        System.out.println("------------------------");
        System.out.println("Serial No: " + serialNo);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Description: " + description);
        System.out.println("------------------------");
    }

    public Product(String serialNo, String name, double price, int quantity, String description){
        this.serialNo = serialNo;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
}

