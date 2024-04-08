import java.util.Scanner;

public class SumDivisibleBy5And2 {
    public static void main(String[] args) {
        int[] values = {100, 52, 43, 99, 42, 40, 91};

        int sum = sumDivisibleBy5And2(values);
        System.out.println("Sum of numbers divisible by both 5 and 2: " + sum);
    }

    public static int sumDivisibleBy5And2(int[] values) {
        int sum = 0;
        for (int value : values) {
            if (value % 5 == 0 && value % 2 == 0) {
                sum += value;
            }
        }
        return sum;
    }
}
