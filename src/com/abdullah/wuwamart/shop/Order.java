package com.abdullah.wuwamart.shop;

public class Order {
    protected int orderId;
    protected String orderBy;
    protected double totalCost;

    public Order(int orderId, String orderBy, double totalCost) {
        this.orderId = orderId;
        this.orderBy = orderBy;
        this.totalCost = totalCost;
    }

    public void displayOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order By: " + orderBy);
        System.out.println("Total Cost: ৳" + totalCost);
    }
}
