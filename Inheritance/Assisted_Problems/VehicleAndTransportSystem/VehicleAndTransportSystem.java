
package Inheritance.Assisted_Problems.VehicleAndTransportSystem;

import java.util.ArrayList;

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        Vehicle car = new Car(20, "Diesel", 4);
        Vehicle truck = new Truck(25, "Diesel", 300);
        Vehicle motorCycle = new Motorcycle(120, "Petrol", "Racing");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(motorCycle);

        for(Vehicle vehicle : vehicles){
            vehicle.displayInfo();
        }
    }
}
