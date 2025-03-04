package constructors_and_access_modifiers.level1.hotel_booking;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking(){
        System.out.println("this is the default constructor");
    }
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking another){
        this(another.guestName, another.roomType, another.nights);
    }
}