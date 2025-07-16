package com.abdullah.wuwamart.users;

import java.util.ArrayList;
import com.abdullah.wuwamart.shop.DeliveryOrder;

public class Rider extends User {
    private ArrayList<DeliveryOrder> orders;

    public Rider(int id, String fullName, String userName, String password, String email) {
        super(id, fullName, userName, password, email);
        this.orders = new ArrayList<>();
    }

    public void addDelOrder(DeliveryOrder order) {
        orders.add(order);
    }

    public void manageOrders() {
        System.out.println("Managing " + orders.size() + " delivery orders.");
    }

    public void displayRiderInfo() {
        super.displayInfo();
        System.out.println("Total Deliveries: " + orders.size());
    }
}
