package constructors_and_access_modifiers.level2.vechicle_registration;

public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static int registrationFee = 2000;
    Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayVehicleDetails(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }
    public void updateRegistrationFee(int fee){
        registrationFee = fee;
    }
}