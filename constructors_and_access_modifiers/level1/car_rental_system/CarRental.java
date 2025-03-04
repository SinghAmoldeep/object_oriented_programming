package constructors_and_access_modifiers.level1.car_rental_system;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static double price = 2000;
    CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        System.out.println("total price is: " + this.rentalDays*price);
    }
}