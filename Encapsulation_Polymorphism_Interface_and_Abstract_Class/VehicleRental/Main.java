package Encapsulation_Polymorphism_Interface_and_Abstract_Class.VehicleRental;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(){{
            add(new Car(191, "Sedan", 3000));
            add(new Car(192, "Hatchback", 2000));
            add(new Bike(292, "Himalayan", 2500));
            add(new Truck(2002, "AL", 7000));
        }};

        for (Vehicle vehicle : vehicles) {
            vehicle.calculateRentalCost(3);
            vehicle.calculateInsurance();
            vehicle.getInsuranceDetails();
        }
    }
}
