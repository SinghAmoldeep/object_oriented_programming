
package constructors_and_access_modifiers.level2.book_library_system;

public class Book {
    public int ISBN;
    protected String title;
    private String author;
    Book(int ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

}