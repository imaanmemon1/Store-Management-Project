import java.util.Scanner;

public class LibraryInteraction {
    private Scanner scanner;

    // Constructor
    public LibraryInteraction() {
        scanner = new Scanner(System.in);
    }

    // Method to create a Book object based on user input
    public Book createBook() {
        System.out.println("Enter the title of the book:");
        String title = scanner.nextLine();

        System.out.println("Enter the author of the book:");
        String author = scanner.nextLine();

        System.out.println("Enter the ISBN of the book:");
        String ISBN = scanner.nextLine();

        System.out.println("Is the book available? (true/false):");
        boolean available = scanner.nextBoolean();

        System.out.println("Enter the number of pages in the book:");
        int pages = scanner.nextInt();

        System.out.println("Is the book an eBook? (true/false):");
        boolean isEbook = scanner.nextBoolean();

        scanner.nextLine(); // Clear buffer
        return new Book(title, author, ISBN, available, pages, isEbook);
    }

    // Method to create a Magazine object based on user input
    public Magazine createMagazine() {
        System.out.println("\nEnter the title of the magazine:");
        String title = scanner.nextLine();

        System.out.println("Enter the author of the magazine:");
        String author = scanner.nextLine();

        System.out.println("Enter the ISBN of the magazine:");
        String ISBN = scanner.nextLine();

        System.out.println("Is the magazine available? (true/false):");
        boolean available = scanner.nextBoolean();

        scanner.nextLine(); // Clear buffer

        System.out.println("Enter the issue number of the magazine:");
        String issue = scanner.nextLine();

        return new Magazine(title, author, ISBN, available, issue);
    }

    // Method to update the availability of an item
    public void updateAvailability(LibraryItem item) {
        System.out.println("Do you want to update the availability? (true/false):");
        boolean available = scanner.nextBoolean();
        item.setAvailable(available);
        System.out.println("Updated item: " + item.toString());
    }

    // Close the scanner when done
    public void closeScanner() {
        scanner.close();
    }
}