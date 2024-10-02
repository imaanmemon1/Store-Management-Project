import java.util.Scanner;

/**
 * Main class to interact with the store management system.
 */
public class StoreRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryInteraction libraryInteraction = new LibraryInteraction(scanner);

      /**
       * Starting question for the user what they want to add
       */

        System.out.println("Do you want to add a book/magazine/nothing?");
        System.out.println("(Enter 'book', 'magazine', or 'nothing'): ");
        String choice = scanner.nextLine();

      /**
       * Choices the user would chose (book, magazine, or nothing)
       */
        if (choice.equals("book")) {
            Book book = libraryInteraction.createBook();
            System.out.println("Book added: " + book);
        } else if (choice.equals("magazine")) {
            Magazine magazine = libraryInteraction.createMagazine();
            System.out.println("Magazine added: " + magazine);
        } else if (choice.equals("nothing")) {
            System.out.println("No entries added. Exiting.");
        } else {
            System.out.println("Invalid option. Please enter 'book', 'magazine', or 'nothing'.");
        }
      /**
       * It ends off with a Thank you after finish adding a book or magazine
       */
        scanner.close();
        System.out.println("\nThank you for using the Library Store Magagement!");
    }
}
