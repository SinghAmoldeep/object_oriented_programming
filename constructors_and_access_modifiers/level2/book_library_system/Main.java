package constructors_and_access_modifiers.level2.book_library_system;

public class Main {
    public static void main(String[] args) {
        EBook eBook = new EBook(4759403, "Crime and Punishment", "Fyodor Dostoevsky");
        eBook.displayDetails();
    }
}