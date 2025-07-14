package wuwamart.shop;

import java.util.ArrayList;

public class Category {
    private int catId;
    private String catName;
    private ArrayList<Item> items;

    public Category(int catId, String catName) {
        this.catId = catId;
        this.catName = catName;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item successfully added to category!");
    }

    public void displayCategory() {
        System.out.println("Category ID: " + catId);
        System.out.println("Category: " + catName);
        for (Item item : items) {
            item.display();
            System.out.println("--------");
        }
    }
}
