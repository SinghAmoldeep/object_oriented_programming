package Inheritance.Hybrid_Inheritance.VehicleManagementSystem;

public class ElectricVehicle extends Vehicle {
    int chargeTime;

    public ElectricVehicle(int maxSpeed, int model, int chargeTime) {
        super(maxSpeed, model);
        this.chargeTime = chargeTime;
    }

    public void charge() {
        System.out.println("Electric vehicle " + this.model +  " charged in " + this.chargeTime + " hours");
    }
}