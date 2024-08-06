package com.marketplace.products;

public class Testing {
    public static void main(String[] args) {
        Category category1 = new Category("Bedroom");
        Category category2 = new Category("Kitchen");
        Category category3 = new Category("Washroom");
        Category category4 = new Category("Drawing room");

        Product product =  new Product("satyam","bed",25,1,"this is a bed");
        Product product2 =  new Product("shivam","table",20,2,"this is a table");
        category1.addProduct(product);
        category1.addProduct(product2);

        category1.displayProducts();

        Product display =category1.findProductBySerialNo();
        display.setQuantity(10);
        display.displayDetails();

    }

}
