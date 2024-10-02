public class LibraryItem {
    // Instance variables shared with subclasses
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    // No-argument constructor
    public LibraryItem() {
        this.title = "";
        this.author = "";
        this.ISBN = "";
        this.available = true;
    }

    // Parameterized constructor
    public LibraryItem(String title, String author, String ISBN, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = available;
    }

    // Accessor and Mutator methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // toString() method
    //Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Available: " + available;
    }
}