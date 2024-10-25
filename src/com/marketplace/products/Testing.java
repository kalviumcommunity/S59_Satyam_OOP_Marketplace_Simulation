package com.marketplace.products;

import com.marketplace.users.Customer;
import com.marketplace.users.Employee;
import com.marketplace.users.User;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        ProductInventory inventory = new ProductInventory();

        // Adding products to inventory
        Product product1 = new Product("P101", "Chair", 2000, 10, "Comfortable chair");
        Product product2 = new Product("P102", "Table", 5000, 5, "Dining table");
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        inventory.displayAllProducts();

        // Searching and updating product quantity
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the serial number to find the product:");
        String serialNo = scanner.nextLine();
        inventory.updateProductQuantity(serialNo, 10);

        // Example with User polymorphism
        User customer = new Customer("Sam");
        User employee = new Employee("Satyam");
        customer.displayRole();
        employee.displayRole();

        Product chair = new Product("P101", "Chair", 2000, 10, "Comfortable chair");
        Furniture sofa = new Furniture("F102", "Sofa", 10000, 5, "Luxury sofa", "Leather");

        chair.applyDiscount(10);
        sofa.applyDiscount(10);
    }
}
