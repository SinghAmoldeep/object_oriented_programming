
package Inheritance.Assisted_Problems.VehicleAndTransportSystem;

public class Truck extends Vehicle{
    private int maxLoad;

    public Truck(int maxSpeed, String fuelType,int maxLoad) {
        super(maxSpeed, fuelType);
        this.maxLoad =maxLoad;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Max Load : "+maxLoad);
        System.out.println();
    }

}
