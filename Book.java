public class Book extends LibraryItem {
    // Instance variable specific to Book
    private int pages;
    private boolean isEbook;

    // No-argument constructor
    public Book() {
        super();
        this.pages = 0;
        this.isEbook = false;
    }

    // Parameterized constructor
    public Book(String title, String author, String ISBN, boolean available, int pages, boolean isEbook) {
        super(title, author, ISBN, available);
        this.pages = pages;
        this.isEbook = isEbook;
    }

    // Accessor and Mutator methods
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isEbook() {
        return isEbook;
    }

    public void setEbook(boolean isEbook) {
        this.isEbook = isEbook;
    }

    // toString() method
    // Override
    public String toString() {
        return super.toString() + ", Pages: " + pages + ", eBook: " + isEbook;
    }
}