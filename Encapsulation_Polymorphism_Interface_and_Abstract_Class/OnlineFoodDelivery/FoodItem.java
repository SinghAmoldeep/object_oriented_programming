package Encapsulation_Polymorphism_Interface_and_Abstract_Class.OnlineFoodDelivery;

public abstract class FoodItem implements IDiscountable {
    private String name;
    protected int price;
    protected int quantity;
    protected int discount;

    public FoodItem(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract int calculateTotalPrice();

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    @Override
    public void getDiscountDetails(){
        System.out.println("Discount Applied: " + discount);
    }
    @Override
    public void applyDiscount() {
        this.discount = (int)(this.price * 0.30);
    }
}
