
package java_classes_and_objects.Level_1.Inventory_problem;

public class Main {
    public static void main(String[] args) {
        Item item1=new Item(1257, "Book", 1200);
        Item item2=new Item(1248, "Trimmer", 1270);
        Item item3=new Item(1237, "Charger", 1250);

        item1.display();
        item1.item_total_price(10);
        java_classes_and_objects.Level_1.Inventory_problem.Item.getTotalPrice();
    }
}
