package com.marketplace.products;

import java.util.ArrayList;
import java.util.Scanner;

public class Category {
    private String name;
    private ArrayList<Product> products;

    public String getName(){
       return name;
    }

    public Category(String name){
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void displayProducts(){
        for(Product product : products){
            product.displayDetails();
        }
    }


    public Product findProductBySerialNo(){
        System.out.println("Find product by serial no");
        Scanner scanner = new Scanner(System.in);
        String serialNo = scanner.nextLine();
        for(Product product : products){
            if(product.getSerialNo().equals(serialNo)){
                return product;
            }

        }
        return null;
    }

}
