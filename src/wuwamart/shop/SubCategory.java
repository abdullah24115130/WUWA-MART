package wuwamart.shop;

import java.util.ArrayList;

public class SubCategory {

    private int subCatId;
    private String subCatName;
    private ArrayList<Item> items;

    public SubCategory(int subCatId, String subCatAName) {
        this.subCatId = subCatId;
        this.subCatName = subCatName;
        this.items = new ArrayList<>();//khali item list
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displaySubCat() {
        System.out.println("SubCategory Id: " + subCatId);
        System.out.println("SubCategory Name: " + subCatName);
        for (Item item : items) {
            item.display();
        }

    }
}
