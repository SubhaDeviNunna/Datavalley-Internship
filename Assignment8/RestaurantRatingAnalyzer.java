import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantRatingAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> restaurantCountByRatingRange = new HashMap<>();
        Map<String, Integer> totalRatingByRatingRange = new HashMap<>();

        // Input restaurant ratings
        System.out.print("Enter the number of restaurants: ");
        int numRestaurants = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numRestaurants; i++) {
            System.out.print("Enter restaurant name: ");
            String restaurantName = scanner.nextLine();
            System.out.print("Enter restaurant rating (1-10): ");
            int rating = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String ratingRange = getRatingRange(rating);

            // Update restaurant count by rating range
            restaurantCountByRatingRange.put(ratingRange, restaurantCountByRatingRange.getOrDefault(ratingRange, 0) + 1);

            // Update total rating by rating range
            totalRatingByRatingRange.put(ratingRange, totalRatingByRatingRange.getOrDefault(ratingRange, 0) + rating);
        }

        // Display results
        System.out.println("\nRestaurant Rating Analysis:");

        for (Map.Entry<String, Integer> entry : restaurantCountByRatingRange.entrySet()) {
            String ratingRange = entry.getKey();
            int count = entry.getValue();
            double averageRating = (double) totalRatingByRatingRange.get(ratingRange) / count;

            System.out.println("Restaurants rated within rating range " + ratingRange + ": " + count);
            System.out.println("Average rating: " + averageRating);
            System.out.println();
        }

        scanner.close();
    }

    public static String getRatingRange(int rating) {
        if (rating >= 1 && rating <= 5) {
            return "1-5";
        } else if (rating >= 6 && rating <= 10) {
            return "6-10";
        } else {
            return "Invalid rating";
        }
    }
}
