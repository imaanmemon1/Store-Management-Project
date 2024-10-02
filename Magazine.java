/**
 * Represents a magazine, extending LibraryItem with additional properties.
 */
public class Magazine extends LibraryItem {
    private String issue;

    // No-argument constructor
    public Magazine() {
        super();
        this.issue = "";
    }

    // Parameterized constructor
    public Magazine(String title, String author, String ISBN, boolean available, String issue) {
        super(title, author, ISBN, available);
        this.issue = issue;
    }

    // Accessor method
    public String getIssue() {
        return issue;
    }

    // toString method
    // Override
    public String toString() {
        return super.toString() + ", Issue: " + issue;
    }
}