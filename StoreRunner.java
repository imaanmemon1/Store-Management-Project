public class StoreRunner {
    public static void main(String[] args) {
        // Initialize the LibraryInteraction class
        LibraryInteraction libraryInteraction = new LibraryInteraction();

        // Create a book
        Book book = libraryInteraction.createBook();
        System.out.println("Book created: " + book.toString());

        // Create a magazine
        Magazine magazine = libraryInteraction.createMagazine();
        System.out.println("Magazine created: " + magazine.toString());

        // Update the availability of the book
        libraryInteraction.updateAvailability(book);

        // Update the availability of the magazine
        libraryInteraction.updateAvailability(magazine);

        // Close the scanner
        libraryInteraction.closeScanner();

        System.out.println("\nThank you for using the Library Store Magagement!");
    }
}