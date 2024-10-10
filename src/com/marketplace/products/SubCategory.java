package com.marketplace.products;

public class SubCategory extends Category {
    private String subcategoryName;

    public SubCategory(String name, String subcategoryName) {
        super(name);
        this.subcategoryName = subcategoryName;
    }

    public String getSubcategoryName() {
        return subcategoryName;
    }

    public void displaySubcategoryDetails() {
        System.out.println("Category: " + getName() + ", Subcategory: " + subcategoryName);
    }
}
