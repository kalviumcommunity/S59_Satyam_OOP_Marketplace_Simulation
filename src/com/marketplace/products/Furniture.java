package com.marketplace.products;

public class Furniture extends Product {
    private String material;

    public Furniture(String serialNo, String name, double price, int quantity, String description, String material) {
        super(serialNo, name, price, quantity, description);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Material: " + material);
    }
}
