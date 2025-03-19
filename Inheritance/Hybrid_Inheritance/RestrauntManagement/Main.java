
package Inheritance.Hybrid_Inheritance.RestrauntManagement;


public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("Netan", 28, "Italian");
        Waiter waiter = new Waiter("Sahil", 25, 10);

        chef.performDuties();
        waiter.performDuties();
    }
}
