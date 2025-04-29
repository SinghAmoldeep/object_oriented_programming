package Encapsulation_Polymorphism_Interface_and_Abstract_Class.OnlineFoodDelivery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FoodItem> items = new ArrayList<>(){{
            add(new VegItem("Paneer Tikka", 340, 1, 10));
            add(new NonVegItem("Butter Chicken", 670, 2, 20, 30));
        }};

        for (FoodItem item : items) {
            item.getDetails();
            item.applyDiscount();
            item.getDiscountDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
        }
    }
}