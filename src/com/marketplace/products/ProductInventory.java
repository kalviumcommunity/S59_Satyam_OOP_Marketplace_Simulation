package com.marketplace.products;

import java.util.ArrayList;
import java.util.List;

public class ProductInventory {
    private List<Product> products;

    public ProductInventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findProductBySerialNo(String serialNo) {
        for (Product product : products) {
            if (product.getSerialNo().equals(serialNo)) {
                return product;
            }
        }
        return null;
    }

    public void displayAllProducts() {
        for (Product product : products) {
            product.displayDetails();
        }
    }

    public void updateProductQuantity(String serialNo, int additionalQuantity) {
        Product product = findProductBySerialNo(serialNo);
        if (product != null) {
            product.updateQuantity(additionalQuantity);
            System.out.println("Updated quantity for " + product.getName());
        } else {
            System.out.println("Product not found!");
        }
    }
}
