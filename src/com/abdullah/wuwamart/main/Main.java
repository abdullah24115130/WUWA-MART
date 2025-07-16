package com.abdullah.wuwamart.main;

import com.abdullah.wuwamart.users.Customer;
import com.abdullah.wuwamart.shop.Item;
import com.abdullah.wuwamart.shop.Category;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Abdullah", "abdullah15", "pass123", "abdullah@gmail.com");
        c1.displayInfo();

        Item item1 = new Item(101, "Laptop", 10, 75000); 
        Item item2 = new Item(102, "Smartphone", 25, 20000);

        Category cat1 = new Category(1, "Electronics"); 
        cat1.addItem(item1);
        cat1.addItem(item2);

        cat1.displayCategory(); 
    }
}

