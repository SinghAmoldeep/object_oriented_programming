package Encapsulation_Polymorphism_Interface_and_Abstract_Class.E_Commerce;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Electronics e1 = new Electronics(1, "Mobile", 20400);
        Electronics e2 = new Electronics(2, "Mobile", 129300);
        Clothing c1 = new Clothing(3, "Tee", 2040);
        Clothing c2 = new Clothing(4, "Hoodie", 4300);
        Clothing c3 = new Clothing(5, "Pant", 3030);
        Groceries g1 = new Groceries(6, "Salt", 290);

        ArrayList<Product> products = new ArrayList<Product>(){{
            add(e1);
            add(e2);
            add(c1);
            add(c2);
            add(c3);
            add(g1);
        }};

        for (Product p : products) {
            p.calculateDiscount();
            p.calculateTax();
            p.displayFinalPrice();
        }
    }
}