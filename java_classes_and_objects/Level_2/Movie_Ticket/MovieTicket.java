package java_classes_and_objects.Level_2.Movie_Ticket;

public class MovieTicket {
    // Attributes
    private final String movieName;
    private int seatNumber;
    private final double price;

    private static boolean[] seats = new boolean[100];


    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.seatNumber = -1;
    }


    public void bookTicket(int seatNumber) {
        if (seatNumber < 0 || seatNumber >= seats.length) {
            System.out.println("Invalid seat number!");
            return;
        }

        if (seats[seatNumber]) {
            System.out.println("Seat " + seatNumber + " is already booked!");
        } else {
            seats[seatNumber] = true;
            this.seatNumber = seatNumber;
            System.out.println("Ticket booked successfully for seat number: " + seatNumber);
        }
    }


    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        if (seatNumber != -1) {
            System.out.println("Seat Number: " + seatNumber);
        } else {
            System.out.println("Seat Number: Not booked yet");
        }
        System.out.println("Price: " + price);
    }


    public void cancelTicket() {
        if (seatNumber != -1) {
            seats[seatNumber] = false;
            System.out.println("Ticket for seat " + seatNumber + " has been canceled.");
            seatNumber = -1;
        } else {
            System.out.println("No ticket booked to cancel.");
        }
    }
}