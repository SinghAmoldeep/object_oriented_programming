
package Inheritance.Hybrid_Inheritance.VehicleManagementSystem;

public class PetrolVehicle extends Vehicle implements IRefuelable {
    int fuelCapacity;

    public PetrolVehicle(int maxSpeed, int model, int fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling " + this.model +  " fuel capacity " + this.fuelCapacity + " liters");
    }
}
