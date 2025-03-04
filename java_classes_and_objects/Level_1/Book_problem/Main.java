package java_classes_and_objects.Level_1.Book_problem;

public class Main {
    public static void main(String[] args) {
        Book b1=new Book("DSA", "Amoldeep", 1000);
        Book b2=new Book("OS", "Amoldeep", 900);

        b1.showDetails();
        b2.showDetails();
    }
}