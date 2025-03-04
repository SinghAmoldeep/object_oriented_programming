package java_classes_and_objects.Level_2.Shoping_Cart;

import java.util.ArrayList;


class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();


    public void addItem(String itemName, double price, int quantity) {
        cart.add(new CartItem(itemName, price, quantity));
        System.out.println(quantity + " " + itemName + "(s) added to cart.");
    }


    public void removeItem(String itemName) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(itemName)) {
                cart.remove(i);
                System.out.println(itemName + " removed from cart.");
                break;
            }
        }
    }


    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: " + total);
    }
}