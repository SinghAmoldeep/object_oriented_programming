
package Inheritance.Multlevel_Inheritance.OnlineRetailOrder;

import java.time.LocalDate;


public class DeliveredOrder extends ShippedOrder {
    LocalDate deliveryDate;

    public DeliveredOrder(int orderId, LocalDate orderDate, int trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public DeliveredOrder(ShippedOrder shippedOrder, LocalDate deliveryDate) {
        super(shippedOrder.orderId, shippedOrder.orderDate, shippedOrder.trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void orderDetails() {
        System.out.println("Order Delivered!");
    }
}
