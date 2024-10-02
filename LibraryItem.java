/**
 * Represents a general library item with common properties
 */
public class LibraryItem {
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

  /**
 * No argument constructor for book
 */
      public LibraryItem() {
        this.title = "";
        this.author = "";
        this.ISBN = "";
        this.available = true; // Default to available
    }
/**
 * parameterized constructor for book
 */
    public LibraryItem(String title, String author, String ISBN, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = available;
    }

 /**
 * Accessor methods for book
 */
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return available;
    }

/**
 * Mutator method for the book
 */
    public void setAvailable(boolean available) {
        this.available = available;
    }

   /**
 * to string method for book
 */    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Available: " + available;
    }
}
