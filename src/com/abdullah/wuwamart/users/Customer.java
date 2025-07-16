package com.abdullah.wuwamart.users;

import java.util.ArrayList;

public class Customer extends User {
    private ArrayList<Object> orders;

    public Customer(int id, String fullName, String userName, String password, String email) {
        super(id, fullName, userName, password, email);
        this.orders = new ArrayList<>();
    }

    public void addOrder(Object order) {
        orders.add(order);
        System.out.println("✅ Order added!");
    }

    public void cancelOrder(int index) {
        if (index >= 0 && index < orders.size()) {
            orders.remove(index);
            System.out.println("❌ Order cancelled.");
        } else {
            System.out.println("⚠️ Invalid order index.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Orders: " + orders.size());
    }
}