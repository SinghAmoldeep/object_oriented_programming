package Encapsulation_Polymorphism_Interface_and_Abstract_Class.E_Commerce;

public class Clothing extends Product{
    public Clothing(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public void calculateDiscount() {
        discount = productPrice * 0.10;
    }

    @Override
    public void calculateTax(){
        tax = productPrice * 0.18;
    }
    @Override
    public double getTaxDetails(){
        return tax;
    }
}
