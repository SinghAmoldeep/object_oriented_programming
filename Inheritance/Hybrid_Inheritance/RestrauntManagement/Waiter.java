
package Inheritance.Hybrid_Inheritance.RestrauntManagement;
public class Waiter extends Person implements IWorker {
    int workLoad;

    public Waiter(String name, int age, int workLoad) {
        super(name, age);
        this.workLoad = workLoad;
    }

    @Override
    public void performDuties(){
        System.out.println("Waiter Duties Performed!");
    }
}
