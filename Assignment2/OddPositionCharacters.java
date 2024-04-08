import java.util.Scanner;

public class OddPositionCharacters {
    public static void main(String[] args) {
        String text = "type here to search";

        String oddPositionChars = getOddPositionCharacters(text);
        System.out.println("Odd position characters (ignoring whitespace): " + oddPositionChars);
    }

    public static String getOddPositionCharacters(String text) {
        StringBuilder oddPositionChars = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ' && i % 2 != 0) {
                oddPositionChars.append(text.charAt(i));
            }
        }

        return oddPositionChars.toString();
    }
}
