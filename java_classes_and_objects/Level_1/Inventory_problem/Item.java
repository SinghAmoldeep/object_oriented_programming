package java_classes_and_objects.Level_1.Inventory_problem;



public class Item {
    int itemCode;
    String itemName;
    int price;
    private static int totalPrice;

    Item(int itemCode , String itemName , int price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
        totalPrice+=price;
    }

    public void display(){
        System.out.println("Item Code is : " + itemCode);
        System.out.println("Item Name is :" + itemName);
        System.out.println("Item price is : " + price);
    }

    public static void getTotalPrice(){
        System.out.println(totalPrice);
    }

    public void item_total_price(int quantity){
        System.out.println("Price for item's given quantity" + this.price*quantity);
    }
}