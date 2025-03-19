
package Inheritance.Multlevel_Inheritance.OnlineRetailOrder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Order o1 = new Order(1, LocalDate.of(2025, 1, 10));
        o1.orderDetails();

        ShippedOrder so1 = new ShippedOrder(o1, 291902);
        so1.orderDetails();

        DeliveredOrder do1 = new DeliveredOrder(so1, LocalDate.of(2025, 1, 15));
        do1.orderDetails();

    }
}
