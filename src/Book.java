import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    private String title;
    private String author;
    private ArrayList<Integer> ratings; // List of ratings
    private static int totalBooks = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.ratings = new ArrayList<>();
        totalBooks++;
    }

    public void addRating(int rating) throws IllegalArgumentException {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Invalid rating: must be 1-5 stars");
        }
        ratings.add(rating);
    }

    public void addMultipleRatings(int... ratings) {
         System.out.println("Ratings Added: " + Arrays.toString(ratings));
        for (int rating : ratings) {
            try {
                addRating(rating);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return sum / ratings.size();
    }

    public String getPopularityLevel() {
        double avg = getAverageRating();
        if (avg == 0.0) {
            return "No ratings";
        } else if (avg >= 4.5) {
            return "Excellent";
        } else if (avg >= 3.5) {
            return "Good";
        } else if (avg >= 2.5) {
            return "Average";
        } else if (avg >= 1.5) {
            return "Poor";
        } else {
            return "Terrible";
        }
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String displayBook() {
        return "Book: " + title + " by " + author + ", Average Rating: " + getAverageRating() + ", Level: " + getPopularityLevel();
    }
}
