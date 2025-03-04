package java_classes_and_objects.Level_2.Movie_Ticket;

public class Main {
    public static void main(String[] args) {

        MovieTicket ticket1 = new MovieTicket("Inception", 125);
        MovieTicket ticket2 = new MovieTicket("Interstellar", 150);


        System.out.println("Ticket 1 Details:");
        ticket1.displayTicketDetails();
        System.out.println("Ticket 2 Details:");
        ticket2.displayTicketDetails();


        System.out.println("\nBooking seat 15 for Ticket 1:");
        ticket1.bookTicket(15);

        System.out.println("\nBooking seat 15 for Ticket 2:");
        ticket2.bookTicket(15);

        System.out.println("\nBooking seat 20 for Ticket 2:");
        ticket2.bookTicket(20);


        System.out.println("\nTicket 1 Details after booking:");
        ticket1.displayTicketDetails();
        System.out.println("\nTicket 2 Details after booking:");
        ticket2.displayTicketDetails();


        System.out.println("\nCanceling Ticket 1:");
        ticket1.cancelTicket();
        System.out.println("\nTicket 1 Details after cancellation:");
        ticket1.displayTicketDetails();


        System.out.println("\nBooking seat 15 for Ticket 2 after cancellation:");
        ticket2.bookTicket(15);
    }
}