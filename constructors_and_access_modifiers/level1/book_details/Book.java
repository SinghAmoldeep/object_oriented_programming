package constructors_and_access_modifiers.level1.book_details;

public class Book {
    String title;
    String author;
    double price;
    Book(){
        System.out.println("About book");
    }
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
}