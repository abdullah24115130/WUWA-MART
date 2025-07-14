//Shop.java class = The entire WuwaMart storehouse, where categories are added and products are displayed.
package wuwamart.shop;
import java.util.*;
public class Shop {
    private ArrayList<Category>categories;
    public Shop(){
        categories =new ArrayList<>();
    }
    
    public void addCatagory(Category cat){
        categories.add(cat);
        System.out.println("Category added to shop.");
    }
    
    public void displayAllCategories(){
        for(Category c: categories){
            c.displayCategory();
        }
    }
}
