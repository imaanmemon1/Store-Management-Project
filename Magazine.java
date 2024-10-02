public class Magazine extends LibraryItem {
    // Instance variable specific to Magazine
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

    // Accessor and Mutator methods
    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    // toString() method
    // Override
    public String toString() {
        return super.toString() + ", Issue: " + issue;
    }
}