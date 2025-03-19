
package Inheritance.Assisted_Problems.VehicleAndTransportSystem;

public class Motorcycle extends Vehicle {
    private String bikeType;

    public Motorcycle(int maxSpeed, String fuelType, String bikeType) {
        super(maxSpeed, fuelType);
        this.bikeType = bikeType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bike Type : " + bikeType);
        System.out.println();
    }
}
