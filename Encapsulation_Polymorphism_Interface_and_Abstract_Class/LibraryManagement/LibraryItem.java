package Encapsulation_Polymorphism_Interface_and_Abstract_Class.LibraryManagement;

public abstract class LibraryItem implements IReservable {
    static int totalItems = 0;
    int itemId;
    String title;
    String author;
    int loanDuration;
    boolean reserved;

    public LibraryItem(String title, String author) {
        this.itemId = ++totalItems;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();
    public void getItemDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Duration: " + this.loanDuration);
    }

    @Override
    public void reserveItem(){
        this.reserved = true;
    }

    @Override
    public void checkAvailability(){
        if(this.reserved){
            System.out.println("Book is not available");
        } else{
            System.out.println("Book is available");
        }
    }
}