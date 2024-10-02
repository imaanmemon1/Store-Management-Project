import java.util.Scanner;

/**
 * User interaction for creating library items
 */
public class LibraryInteraction {
    private Scanner scanner;

    public LibraryInteraction(Scanner scanner) {
        this.scanner = scanner;
    }

 /**
 * Asks questions about the book.
 */ 
    public Book createBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Is the book available? (true/false): ");
        boolean available = scanner.nextBoolean();
        System.out.print("Enter number of pages: ");
        int pages = scanner.nextInt();
        System.out.print("Is it an eBook? (true/false): ");
        boolean isEbook = scanner.nextBoolean();
        scanner.nextLine(); 
/**
 * Returns the results of the book the user typed in altogether.
 */
        return new Book(title, author, isbn, available, pages, isEbook);
    }
/**
 * Asks questions about the Magazine.
 */
    public Magazine createMagazine() {
        System.out.print("Enter magazine title: ");
        String title = scanner.nextLine();
        System.out.print("Enter magazine author: ");
        String author = scanner.nextLine();    
        System.out.print("Enter magazine ISBN: ");
        String isbn = scanner.nextLine();      
        System.out.print("Is the magazine available? (true/false): ");
        boolean available = scanner.nextBoolean();      
        System.out.print("Enter magazine issue date: ");
        String issue = scanner.next();
        scanner.nextLine(); 
/**
 * Returns the results of the Magazine the user typed in altogether.
 */
        return new Magazine(title, author, isbn, available, issue);
    }
}
