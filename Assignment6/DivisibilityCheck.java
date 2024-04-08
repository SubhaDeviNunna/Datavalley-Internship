import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check divisibility by 7 and 13 simultaneously
        boolean divisibleBy7And13 = checkDivisibilityBy7And13(number);

        if (divisibleBy7And13) {
            // If divisible by both 7 and 13, display quotient and remainder
            int quotient7 = number / 7;
            int remainder7 = number % 7;
            int quotient13 = number / 13;
            int remainder13 = number % 13;

            System.out.println(number + " is divisible by both 7 and 13.");
            System.out.println("Quotient when divided by 7: " + quotient7);
            System.out.println("Remainder when divided by 7: " + remainder7);
            System.out.println("Quotient when divided by 13: " + quotient13);
            System.out.println("Remainder when divided by 13: " + remainder13);
        } else {
            // If not divisible by both 7 and 13, display a message
            System.out.println(number + " is not divisible by both 7 and 13.");
        }

        scanner.close();
    }

    public static boolean checkDivisibilityBy7And13(int number) {
        return number % 7 == 0 && number % 13 == 0;
    }
}
