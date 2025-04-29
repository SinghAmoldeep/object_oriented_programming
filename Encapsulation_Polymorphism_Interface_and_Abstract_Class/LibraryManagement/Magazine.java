package Encapsulation_Polymorphism_Interface_and_Abstract_Class.LibraryManagement;

public class Magazine extends LibraryItem{
    public Magazine(String title, String author) {
        super(title, author);
    }

    @Override
    public int getLoanDuration(){
        this.loanDuration = (int)(Math.random()*50);
        return this.loanDuration;
    }

}