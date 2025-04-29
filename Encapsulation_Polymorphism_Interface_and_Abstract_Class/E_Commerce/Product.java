package Encapsulation_Polymorphism_Interface_and_Abstract_Class.E_Commerce;

public abstract class Product implements ITaxable {
    int productId;
    String productName;
    double productPrice;
    double discount;
    double tax;

    public abstract void calculateDiscount();

    public void displayFinalPrice(){
        System.out.println("Final Price: " + (productPrice + tax - discount));
    }
}