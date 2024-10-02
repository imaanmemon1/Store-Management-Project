/**
 * Represents a book, extending LibraryItem with additional properties.
 */
public class Book extends LibraryItem {
    private int pages;
    private boolean isEbook;
  
  /**
    * No argument constructor 
    */
    public Book() {
        super();
        this.pages = 0;
        this.isEbook = false;
    }

    /**
 * Parameterized constructor for the book
 */
    public Book(String title, String author, String ISBN, boolean available, int pages, boolean isEbook) {
        super(title, author, ISBN, available);
        this.pages = pages;
        this.isEbook = isEbook;
    }

 /**
 * Accessor methods to get number of pages and if its an Ebook
 */
    public int getPages() {
        return pages;
    }

    public boolean isEbook() {
        return isEbook;
    }

/**
 * to string method which will override the number of pages and if its an ebook
 */
    public String toString() {
        return super.toString() + ", Pages: " + pages + ", eBook: " + isEbook;
    }
}
