
package Inheritance.Hybrid_Inheritance.VehicleManagementSystem;


public class Main {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(200, 2024, 2);
        PetrolVehicle pv = new PetrolVehicle(280, 2022, 40);

        ev.charge();
        pv.refuel();
    }
}

