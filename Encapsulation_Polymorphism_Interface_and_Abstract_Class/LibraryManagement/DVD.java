package Encapsulation_Polymorphism_Interface_and_Abstract_Class.LibraryManagement;

public class DVD extends LibraryItem{
    public DVD(String title, String author) {
        super(title, author);
    }

    @Override
    public int getLoanDuration(){
        this.loanDuration = (int)(Math.random()*10);
        return this.loanDuration;
    }
}