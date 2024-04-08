import java.util.Scanner;

public class SumDivisibleBy5And2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] values = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        int sum = sumOfDivisibleBy5And2(values);
        System.out.println("Sum of numbers divisible by both 5 and 2: " + sum);

        scanner.close();
    }

    public static int sumOfDivisibleBy5And2(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 5 == 0 && values[i] % 2 == 0) {
                sum += values[i];
            }
        }
        return sum;
    }
}
