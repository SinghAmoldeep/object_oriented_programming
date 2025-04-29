package Encapsulation_Polymorphism_Interface_and_Abstract_Class.E_Commerce;

public class Electronics extends Product {
    public Electronics(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public void calculateDiscount() {
        discount = productPrice * 0.20;
    }

    @Override
    public void calculateTax(){
        tax = productPrice * 0.28;
    }
    @Override
    public double getTaxDetails(){
        return tax;
    }
}