package Encapsulation_Polymorphism_Interface_and_Abstract_Class.VehicleRental;

public abstract class Vehicle implements IInsurable{
    protected int vehicleNumber;
    String vehicleType;
    double rentalRate;
    double insuranceCost;
    double rentalCost;

    public abstract void calculateRentalCost(int days);
}