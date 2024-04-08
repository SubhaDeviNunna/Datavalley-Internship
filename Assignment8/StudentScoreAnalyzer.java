import java.util.Arrays;
import java.util.Scanner;

public class StudentScoreAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Input test scores
        double[] scores = new double[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the test score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
        }

        // Calculate average score
        double averageScore = calculateAverage(scores);

        // Determine median score
        double medianScore = calculateMedian(scores);

        // Count number of students above, at, and below the average score
        int aboveAverageCount = countAboveAverage(scores, averageScore);
        int atAverageCount = countAtAverage(scores, averageScore);
        int belowAverageCount = countBelowAverage(scores, averageScore);

        // Print results
        System.out.println("\nStudent Score Analysis:");
        System.out.println("Average Score: " + averageScore);
        System.out.println("Median Score: " + medianScore);
        System.out.println("Number of students above average: " + aboveAverageCount);
        System.out.println("Number of students at average: " + atAverageCount);
        System.out.println("Number of students below average: " + belowAverageCount);

        scanner.close();
    }

    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static double calculateMedian(double[] scores) {
        Arrays.sort(scores);
        if (scores.length % 2 == 0) {
            return (scores[scores.length / 2 - 1] + scores[scores.length / 2]) / 2.0;
        } else {
            return scores[scores.length / 2];
        }
    }

    public static int countAboveAverage(double[] scores, double averageScore) {
        int count = 0;
        for (double score : scores) {
            if (score > averageScore) {
                count++;
            }
        }
        return count;
    }

    public static int countAtAverage(double[] scores, double averageScore) {
        int count = 0;
        for (double score : scores) {
            if (score == averageScore) {
                count++;
            }
        }
        return count;
    }

    public static int countBelowAverage(double[] scores, double averageScore) {
        int count = 0;
        for (double score : scores) {
            if (score < averageScore) {
                count++;
            }
        }
        return count;
    }
}
