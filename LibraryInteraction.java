import java.util.Scanner;

/**
 * User interaction for creating library items
 */
public class LibraryInteraction {
    private Scanner scanner;

    public LibraryInteraction(Scanner scanner) {
        this.scanner = scanner;
    }

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

        return new Book(title, author, isbn, available, pages, isEbook);
    }

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

        return new Magazine(title, author, isbn, available, issue);
    }
}