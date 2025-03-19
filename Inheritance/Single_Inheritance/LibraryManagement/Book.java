package Inheritance.Single_Inheritance.LibraryManagement;

public class Book extends Author {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear, String name, String bio) {
        super(name, bio);
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author: " + name);
        System.out.println("Author's Bio: " + bio);
    }
}