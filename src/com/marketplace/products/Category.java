package com.marketplace.products;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            product.displayDetails();
        }
    }

    // Public method to find a product by serial number doing work of abstraction
    public Product findProductBySerialNo(String serialNo) {
        for (Product product : products) {
            if (product.getSerialNo().equals(serialNo)) {
                return product;
            }
        }
        return null;
    }
}
