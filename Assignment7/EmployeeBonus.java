import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input current year and year of joining
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter the year of joining: ");
        int yearOfJoining = scanner.nextInt();

        // Calculate years of service
        int yearsOfService = currentYear - yearOfJoining;

        // Determine bonus amount
        int bonus = calculateBonus(yearsOfService);

        // Display bonus information
        if (bonus > 0) {
            System.out.println("Congratulations! You are eligible for a bonus of Rs. " + bonus);
        } else {
            System.out.println("Sorry! You are not eligible for any bonus.");
        }

        scanner.close();
    }

    public static int calculateBonus(int yearsOfService) {
        if (yearsOfService > 5) {
            return 5000;
        } else if (yearsOfService >= 3) {
            return 3000;
        } else {
            return 0;
        }
    }
}
