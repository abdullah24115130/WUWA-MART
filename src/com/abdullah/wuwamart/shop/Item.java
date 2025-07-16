package com.abdullah.wuwamart.shop;

public class Item {
    private int itemId;
    private String itemName;
    private double stock;
    private double price;

    public Item(int itemId, String itemName, double stock, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.stock = stock;
        this.price = price;
    }

    public void display() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Item Name: " + itemName);
        System.out.println("In Stock: " + stock);
        System.out.println("Price: ৳" + price);
    }
}
