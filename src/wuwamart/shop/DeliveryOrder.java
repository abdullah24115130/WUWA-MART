package wuwamart.shop;

public class DeliveryOrder extends Order {

    public DeliveryOrder(int orderId, String orderBy, double totalCost) {
        super(orderId, orderBy, totalCost);

    }

    //Override 
    public void displayOrderInfo() {
        System.out.println("Delivery Order: ");

        super.displayOrderInfo();
    }

}
