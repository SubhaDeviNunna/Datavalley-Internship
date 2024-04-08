import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookReviewAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> bookCountByRatingRange = new HashMap<>();
        Map<String, Integer> reviewSentimentCount = new HashMap<>();

        // Input book reviews
        System.out.print("Enter the number of book reviews: ");
        int numReviews = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numReviews; i++) {
            System.out.print("Enter book title: ");
            String bookTitle = scanner.nextLine();
            System.out.print("Enter book rating (1-10): ");
            int rating = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String ratingRange = getRatingRange(rating);

            // Update book count by rating range
            bookCountByRatingRange.put(ratingRange, bookCountByRatingRange.getOrDefault(ratingRange, 0) + 1);

            // Update review sentiment count
            String sentiment = getSentiment(rating);
            reviewSentimentCount.put(sentiment, reviewSentimentCount.getOrDefault(sentiment, 0) + 1);
        }

        // Display results
        System.out.println("\nBook Review Analysis:");

        for (Map.Entry<String, Integer> entry : bookCountByRatingRange.entrySet()) {
            String ratingRange = entry.getKey();
            int count = entry.getValue();

            System.out.println("Books reviewed within rating range " + ratingRange + ": " + count);
        }

        System.out.println("\nReview Sentiment:");

        for (Map.Entry<String, Integer> entry : reviewSentimentCount.entrySet()) {
            String sentiment = entry.getKey();
            int count = entry.getValue();

            System.out.println(sentiment + " reviews: " + count);
        }

        scanner.close();
    }

    public static String getRatingRange(int rating) {
        if (rating >= 1 && rating <= 5) {
            return "1-5 stars";
        } else if (rating >= 6 && rating <= 10) {
            return "6-10 stars";
        } else {
            return "Invalid rating";
        }
    }

    public static String getSentiment(int rating) {
        if (rating >= 1 && rating <= 3) {
            return "Negative";
        } else if (rating >= 4 && rating <= 7) {
            return "Neutral";
        } else {
            return "Positive";
        }
    }
}
