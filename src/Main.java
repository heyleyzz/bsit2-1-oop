public class Main {
    public static void main(String[] args) {
        System.out.println("Adding books and ratings...");

        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Data Structures", "Alice Brown");
        Book book3 = new Book("Web Development", "Bob Wilson");

        try {
            book1.addRating(4);
            System.out.println("Rating 4 added successfully");
            book1.addMultipleRatings(4, 4, 4);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            book2.addRating(5);
            System.out.println("Rating 5 added successfully");
            book2.addMultipleRatings(4, 4, 4);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            book3.addRating(3);
            System.out.println("Rating 3 added successfully");
            book3.addMultipleRatings (3, 3, 3, 4);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            book2.addRating(6);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        System.out.println("\nBook Results:");
        System.out.println(book1.displayBook());
        System.out.println(book2.displayBook());
        System.out.println(book3.displayBook());


        System.out.println("\nTotal books created: " + Book.getTotalBooks());


        Book highestRatedBook = book1;
        for (Book book : new Book[]{book1, book2, book3}) {
            if (book.getAverageRating() > highestRatedBook.getAverageRating()) {
                highestRatedBook = book;
            }
        }

        System.out.println("Highest rated book: " + highestRatedBook.getTitle() + " by "
                + highestRatedBook.getAuthor() + " (" + highestRatedBook.getAverageRating() + ")");
    }
}
