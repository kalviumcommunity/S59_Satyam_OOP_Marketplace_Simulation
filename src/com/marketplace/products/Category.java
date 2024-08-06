package com.marketplace.products;

import java.util.ArrayList;

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

    public Product findProductBySerialNo(String serialNo){
        for(Product product : products){
            if(product.getSerialNo().equals(serialNo)){
                return product;
            }

        }
        return null;
    }

}
