package Inheritance.Assisted_Problems.VehicleAndTransportSystem;

public class Car extends Vehicle{
    private int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity : "+seatCapacity);
        System.out.println();
    }

}