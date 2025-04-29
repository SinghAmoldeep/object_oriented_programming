package Encapsulation_Polymorphism_Interface_and_Abstract_Class.OnlineFoodDelivery;

public class NonVegItem extends FoodItem {
    int packingCost;
    int restaurantCost;

    public NonVegItem(String name, int price, int quantity, int packingCost, int restaurantCost) {
        super(name, price, quantity);
        this.packingCost = packingCost;
        this.restaurantCost = restaurantCost;
    }

    @Override
    public int calculateTotalPrice(){
        return this.price * this.quantity + this.packingCost + this.restaurantCost - this.discount;
    }

    @Override
    public void applyDiscount() {
        this.discount = (int)(this.price * 0.15);
    }
}