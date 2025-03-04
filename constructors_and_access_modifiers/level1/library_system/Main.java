
package constructors_and_access_modifiers.level1.library_system;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry potter and secret of chamber", "JK Rowling", 550, true);
        harryPotter.borrowBook();
    }
}