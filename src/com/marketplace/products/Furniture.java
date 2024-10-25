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

    @Override
    public void applyDiscount(double discountPercentage) {
        double additionalDiscount = discountPercentage + 2; // Additional 2% for furniture
        double discountAmount = getPrice() * additionalDiscount / 100;
        setPrice(getPrice() - discountAmount);
        System.out.println("Special Discount applied to Furniture: " + getName() + ". New Price: " + getPrice());
    }
}
