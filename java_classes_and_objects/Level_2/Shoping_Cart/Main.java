package java_classes_and_objects.Level_2.Shoping_Cart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 999.9, 1);
        cart.addItem("Mouse", 255.5, 2);
        cart.displayTotalCost();
        cart.removeItem("Mouse");
        cart.displayTotalCost();
    }
}