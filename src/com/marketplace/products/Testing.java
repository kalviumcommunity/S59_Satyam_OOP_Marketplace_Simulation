package com.marketplace.products;

import com.marketplace.users.Customer;
import com.marketplace.users.Employee;

public class Testing {
    public static void main(String[] args) {

        // I have added "dynamic memory allocation" in previous PR  written below with "new " keyword .
        Category category1 = new Category("Bedroom");
        Category category2 = new Category("Kitchen");
        Category category3 = new Category("Washroom");
        Category category4 = new Category("Furniture");

        //There is no need to add "delete" for deleting and memory space because JVM do it by itself .

        Product product =  new Product("satyam","bed",25,1,"this is a bed");
        Product product2 =  new Product("shivam","table",20,2,"this is a table");
        category1.addProduct(product);
        category1.addProduct(product2);

        category1.displayProducts();

        Product display =category1.findProductBySerialNo();
        display.setQuantity(10);
        display.displayDetails();

        Employee employee1 = new Employee("Satyam");
        Employee employee2 = new Employee("Shivam");
        Employee employee3 = new Employee("Anshul");


        Customer customer = new Customer("sam");
        Customer customer2 = new Customer("Shashi");




    }

}
