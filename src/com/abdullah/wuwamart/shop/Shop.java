package com.abdullah.wuwamart.shop;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Category> categories;

    public Shop() {
        categories = new ArrayList<>();
    }

    public void addCategory(Category cat) {
        categories.add(cat);
        System.out.println("Category added to shop.");
    }

    public void displayAllCategories() {
        for (Category c : categories) {
            c.displayCategory();
        }
    }
}
