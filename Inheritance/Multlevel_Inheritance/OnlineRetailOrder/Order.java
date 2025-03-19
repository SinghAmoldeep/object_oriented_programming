
package Inheritance.Multlevel_Inheritance.OnlineRetailOrder;

import java.time.LocalDate;

public class Order {
    int orderId;
    LocalDate orderDate;

    public Order(int orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public Order(Order order) {
        this.orderId = order.orderId;
        this.orderDate = order.orderDate;
    }

    public void orderDetails() {
        System.out.println("Order Created!");
    }
}
