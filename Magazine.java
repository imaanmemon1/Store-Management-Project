/**
 * Represents a magazine, extending LibraryItem with additional properties.
 */
public class Magazine extends LibraryItem {
    private String issue;

  /**
 * No argument constructor for magazine
 */
    public Magazine() {
        super();
        this.issue = "";
    }

/**
 * Parameterized constructors for the magazine
 */
    public Magazine(String title, String author, String ISBN, boolean available, String issue) {
        super(title, author, ISBN, available);
        this.issue = issue;
    }

 /**
 * Accessor method to get the issue
 */
    public String getIssue() {
        return issue;
    }

 /**
 * to-string method which will override the issue
 */
    public String toString() {
        return super.toString() + ", Issue: " + issue;
    }
}
