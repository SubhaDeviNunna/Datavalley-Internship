import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of days late
        System.out.print("Enter the number of days late to return the book: ");
        int daysLate = scanner.nextInt();

        // Calculate fine
        int fine = calculateFine(daysLate);

        // Display fine or appropriate message
        if (fine > 0) {
            System.out.println("Fine for returning the book " + daysLate + " days late: Rs. " + fine);
        } else {
            System.out.println("No fine for returning the book on time.");
        }

        scanner.close();
    }

    public static int calculateFine(int daysLate) {
        if (daysLate >= 1 && daysLate <= 7) {
            return 50 * daysLate; // 50 paise per day for the first 7 days
        } else if (daysLate >= 8 && daysLate <= 14) {
            return 100 * (daysLate - 7); // 1 rupee per day for days 8-14
        } else if (daysLate > 14 && daysLate <= 21) {
            return 500; // 5 rupees per day for days above 14 but less than or equal to 21
        } else if (daysLate > 21) {
            System.out.println("Membership canceled due to returning the book after 21 days.");
            return 0; // Membership canceled, no fine
        } else {
            return 0; // No fine for returning the book on time
        }
    }
}
