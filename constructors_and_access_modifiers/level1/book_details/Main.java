package constructors_and_access_modifiers.level1.book_details;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry potter and secret of chamber", "JK Rowling", 550);
        System.out.println(harryPotter.title);
    }
}