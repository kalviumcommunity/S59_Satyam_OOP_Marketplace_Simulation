package com.marketplace.products;

import com.marketplace.users.Customer;
import com.marketplace.users.Employee;
import com.marketplace.users.User;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        // Single Inheritance: Category -> SubCategory
        SubCategory subCategory = new SubCategory("Furniture", "Bedroom Furniture");
        subCategory.displaySubcategoryDetails();

        // Multilevel Inheritance: Product -> Furniture -> BedroomFurniture
        BedroomFurniture bed = new BedroomFurniture("B123", "King Bed", 25000, 5, "Luxurious king-size bed", "Wood", "King");
        bed.displayDetails();

        Product defaultProduct = new Product();
        defaultProduct.displayDetails();

        Product product = new Product("P101", "Chair", 2000, 10, "Comfortable chair");
        Product product2 = new Product("P102", "Table", 5000, 5, "Dining table");
        Category category1 = new Category("Living Room");
        category1.addProduct(product);
        category1.addProduct(product2);
        category1.displayProducts();

        //Using of Polymorphism
        Product product3= new Product("P103", "Chair", 2000);
        product3.displayDetails();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the serial number to find the product:");
        String serialNo = scanner.nextLine();
        Product display = category1.findProductBySerialNo(serialNo);

        if (display != null) {
            display.setQuantity(10);
            display.displayDetails();
        } else {
            System.out.println("Product not found!");
        }

        Employee employee1 = new Employee("Satyam");
        Employee employee2 = new Employee("Shivam");

        Customer customer1 = new Customer("Sam");
        Customer customer2 = new Customer("Shashi");

        User customer3 = new Customer("Swasti");
        User employee3 = new Employee("Abhishek");

        // Calling overridden methods (virtual functions)
        customer3.displayRole();
        employee3.displayRole();

    }
}
