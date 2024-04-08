import java.util.Scanner;

public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the index at which character needs to be replaced: ");
        int index = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("Enter the replacement character: ");
        char replacementChar = scanner.nextLine().charAt(0);

        String modifiedString = replaceCharacterAtIndex(str, index, replacementChar);
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }

    public static String replaceCharacterAtIndex(String str, int index, char replacementChar) {
        if (index < 0 || index >= str.length()) {
            // index out of bounds
            return str;
        }

        char[] charArray = str.toCharArray();
        charArray[index] = replacementChar;
        return new String(charArray);
    }
}
