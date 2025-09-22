public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book book2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book book3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);


        Library library = new Library();


        System.out.println("Adding books to library...");
        if (library.addBook(book1)) System.out.println("Book added: " + book1.getTitle() + " by " + book1.getAuthor());
        if (library.addBook(book2)) System.out.println("Book added: " + book2.getTitle() + " by " + book2.getAuthor());
        if (library.addBook(book3)) System.out.println("Book added: " + book3.getTitle() + " by " + book3.getAuthor());

        System.out.println("\nAll books in library:");
        library.displayAllBooks();

        System.out.println("\nBorrowing Java Programming...");
        if (library.borrowBook("1234567890")) {
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Failed to borrow book.");
        }

        System.out.println("\nTrying to borrow Java Programming again...");
        if (library.borrowBook("1234567890")) {
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available for borrowing.");
        }

        System.out.println("\nReturning Java Programming...");
        if (library.returnBook("1234567890")) {
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Failed to return book.");
        }

        System.out.println("\nAvailable books:");
        library.displayAvailableBooks();


        System.out.println("\nTesting validation...");
        Book invalidBook = new Book("Invalid Book", "Unknown Author", "123", 2026);  // Invalid ISBN and Year
    }
}
