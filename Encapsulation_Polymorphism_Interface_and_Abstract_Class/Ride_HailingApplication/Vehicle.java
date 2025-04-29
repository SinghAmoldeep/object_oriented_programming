package Encapsulation_Polymorphism_Interface_and_Abstract_Class.Ride_HailingApplication;

public abstract class Vehicle implements IGPS {
    private static int totalVehicles = 0;
    private int vehicleId;
    private String driverName;
    private int ratePerKm;

    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public int getRatePerKm() {
        return ratePerKm;
    }
    public void setRatePerKm(int ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public Vehicle(String driverName, int ratePerKm) {
        this.vehicleId = ++totalVehicles;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract void calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }


    @Override
    public void getCurrentLocation(){
        System.out.println("Location Fetched!!");
    }

    @Override
    public void updateLocation() {
        System.out.println("Location Updated!!");
    }
}
