import java.util.Scanner;

public class NumberStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        char choice;
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            sum += number;
            count++;

            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        if (count > 0) {
            double average = sum / count;
            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
            System.out.println("Average of all numbers: " + average);
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();
    }
}
