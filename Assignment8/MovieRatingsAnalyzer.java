import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieRatingsAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> movieCountByRating = new HashMap<>();
        Map<String, Integer> totalRatingByRating = new HashMap<>();

        // Input movie ratings
        System.out.print("Enter the number of movies: ");
        int numMovies = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numMovies; i++) {
            System.out.print("Enter movie title: ");
            String movieTitle = scanner.nextLine();
            System.out.print("Enter movie rating (e.g., PG, PG-13, R): ");
            String movieRating = scanner.nextLine();
            System.out.print("Enter movie rating (0-10): ");
            int rating = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Update movie count by rating
            movieCountByRating.put(movieRating, movieCountByRating.getOrDefault(movieRating, 0) + 1);

            // Update total rating by rating
            totalRatingByRating.put(movieRating, totalRatingByRating.getOrDefault(movieRating, 0) + rating);
        }

        // Display results
        System.out.println("\nMovie Ratings Analysis:");

        for (Map.Entry<String, Integer> entry : movieCountByRating.entrySet()) {
            String rating = entry.getKey();
            int count = entry.getValue();
            double averageRating = (double) totalRatingByRating.get(rating) / count;

            System.out.println("Rating: " + rating);
            System.out.println("Number of movies: " + count);
            System.out.println("Average rating: " + averageRating);
            System.out.println();
        }

        scanner.close();
    }
}
