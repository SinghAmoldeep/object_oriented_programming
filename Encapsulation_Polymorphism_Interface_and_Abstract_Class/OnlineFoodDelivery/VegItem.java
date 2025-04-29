package Encapsulation_Polymorphism_Interface_and_Abstract_Class.OnlineFoodDelivery;

public class VegItem extends FoodItem{
    int packingCost;

    public VegItem(String name, int price, int quantity, int packingCost) {
        super(name, price, quantity);
        this.packingCost = packingCost;
    }

    @Override
    public int calculateTotalPrice(){
        return this.price * this.quantity + this.packingCost - this.discount;
    }
}
