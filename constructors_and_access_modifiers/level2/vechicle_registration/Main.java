package constructors_and_access_modifiers.level2.vechicle_registration;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rishav", "Car");
        v1.displayVehicleDetails();
        v1.updateRegistrationFee(800);
    }
}