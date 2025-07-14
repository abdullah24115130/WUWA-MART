package wuwamart.shop;

import java.util.ArrayList;

public class Category {//onek gulo prodect rakhar jonno 

    private int catId;
    private String catName;
    private ArrayList<Item> items;

    public Category(int catId, String catName) {
        this.catId = catId;
        this.catName = catName;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);//items list a notun item add korsi.
        System.out.println("Item succesfully added to category!");

    }

    public void displayCategory() {
        System.out.println("Cat Id: " + catId);
        System.out.println("Category: " + catName);
        for (Item item : items) {
            item.display();
            System.out.println("--------");

        }

    }

}
