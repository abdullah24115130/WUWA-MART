package wuwamart.shop;

public class Item {

    private int itemId;
    private String itemName;
    private double stock;
    private double price;

    //notum item make korar jonno constructor make korlam.
    public Item(int itemId, String itemName, double stock, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.stock = stock;
    }

    public void display() {
        System.out.println("Item Id: " + itemId);
        System.out.println("Item Name: " + itemName);
        System.out.println("In Stock: " + stock);
        System.out.println("Price: " + price);
    }

}
