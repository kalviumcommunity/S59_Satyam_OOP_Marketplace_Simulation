package com.marketplace.products;

public class Testing {
    public static void main(String[] args) {
        Category category1 = new Category("Bedroom");
        Category category2 = new Category("Kitchen");
        Category category3 = new Category("Washroom");
        Category category4 = new Category("Drawing room");

        Product product =  new Product();
        product.displayDetails();
    }

}
