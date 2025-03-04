
package constructors_and_access_modifiers.level2.book_library_system;

public class EBook extends Book{
    EBook(int ISBN, String title, String author){
        super(ISBN, title, author);
    }
    public void displayDetails(){
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title:" + title);
        System.out.println("Author" + getAuthor());
    }
}