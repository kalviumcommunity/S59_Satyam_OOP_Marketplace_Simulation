package com.marketplace.products;

public class BedroomFurniture extends Furniture {
    private String bedType;

    public BedroomFurniture(String serialNo, String name, double price, int quantity, String description, String material, String bedType) {
        super(serialNo, name, price, quantity, description, material);
        this.bedType = bedType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bed Type: " + bedType);
    }
}
