package com.marketplace.products;

import com.marketplace.users.Customer;
import com.marketplace.users.Employee;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

        Category category1 = new Category("Bedroom");
        Category category2 = new Category("Kitchen");
        Category category3 = new Category("Washroom");
        Category category4 = new Category("Furniture");

        Product defaultProduct = new Product();
        defaultProduct.displayDetails();

        Product product = new Product("satyam", "bed", 25, 1, "this is a bed");
        Product product2 = new Product("shivam", "table", 20, 2, "this is a table");
        category1.addProduct(product);
        category1.addProduct(product2);

        category1.displayProducts();

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
        Employee employee3 = new Employee("Anshul");

        Customer customer1 = new Customer("sam");
        Customer customer2 = new Customer("Shashi");
//
//        int employeeCount = Employee.getEmployeeCount();
//        int customerCount = Customer.getCustomerCount();
//
//        System.out.println("Total Employees: " + employeeCount);
//        System.out.println("Total Customers: " + customerCount);
    }
}
