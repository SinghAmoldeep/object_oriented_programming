package Encapsulation_Polymorphism_Interface_and_Abstract_Class.LibraryManagement;

public class Book extends LibraryItem{
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public int getLoanDuration(){
        this.loanDuration = (int)(Math.random()*100);
        return this.loanDuration;
    }
}
