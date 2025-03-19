package Inheritance.Hybrid_Inheritance.RestrauntManagement;

public class Chef extends Person implements IWorker {
    String type;

    public Chef(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    @Override
    public void performDuties(){
        System.out.println("Chef Duties Performed!");
    }
}