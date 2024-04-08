import java.util.Scanner;

public class OddPositionCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        printOddPositionCharacters(text);

        scanner.close();
    }

    public static void printOddPositionCharacters(String text) {
        text = text.replaceAll("\\s+", ""); // Remove white space
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(text.charAt(i));
            }
        }
    }
}
