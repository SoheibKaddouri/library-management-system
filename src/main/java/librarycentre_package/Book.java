
package librarycentre_package;

public class Book extends Item {
    
    // instance variable
    private String author;

    //constructor
    public Book(String title, String ISBN) {
        super(title, ISBN);
    }

    // set and get method
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
    // description
    @Override
    public String toString(){
        return super.toString() + ", author: " + author ; 
    }
    
    
}
