package constructors_and_access_modifiers.level1.library_system;

public class Book {
    String title;
    String author;
    double price;

    boolean availability;

    Book(){
        System.out.println("About book");
    }
    Book(String title, String author, double price, boolean availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    public void borrowBook(){
        if(this.availability == false) System.out.println("Not available");
        else System.out.println(this.title + " is borrowed.");
    }
}