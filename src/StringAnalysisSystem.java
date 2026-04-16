import java.util.Scanner;

public class StringAnalysisSystem {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask user to enter a sample string
        System.out.print("Enter a sample string: ");
        String text = input.nextLine();

        // Display original string
        System.out.println("Original String: " + text);

        // Display number of characters
        System.out.println("Length: " + text.length());

        // Ask user to enter a word to search
        System.out.print("Enter a word to search: ");
        String word = input.nextLine();

        // Check if word exists in string
        if (text.contains(word)) {
            System.out.println("Result: Word FOUND in the string");
        } else {
            System.out.println("Result: Word NOT FOUND in the string");
        }

        // Ask user to enter another string for comparison
        System.out.print("Enter another string to compare: ");
        String other = input.nextLine();

        // Compare both strings (ignore case)
        if (text.equalsIgnoreCase(other)) {
            System.out.println("Comparison: Strings are EQUAL (ignore case)");
        } else {
            System.out.println("Comparison: Strings are NOT equal");
        }

        // Use charAt() to display first character
        if (text.length() > 0) {
            System.out.println("First character: " + text.charAt(0));
        } else {
            System.out.println("String is empty, no character to display");
        }

        // Check string length condition
        if (text.length() > 10) {
            System.out.println("Message: String is long");
        } else {
            System.out.println("Message: String is short");
        }

        // Close Scanner
        input.close();
    }
}