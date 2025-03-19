
package Inheritance.Multlevel_Inheritance.OnlineRetailOrder;

import java.time.LocalDate;

public class ShippedOrder extends Order {
    int trackingNumber;

    public ShippedOrder(int orderId, LocalDate orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public ShippedOrder(Order order, int trackingNumber) {
        super(order);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void orderDetails() {
        System.out.println("Order Shipped!");
    }
}
