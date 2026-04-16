import java.util.Scanner;

public class StringValidationSystem {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        //  Enter a sample string
        System.out.print("Enter a sample string: ");
        String text = input.nextLine();

        // Display original string
        System.out.println("Original String: " + text);

        // Display length of string
        System.out.println("Length: " + text.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + text.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + text.toLowerCase());

        // Ask the user to enter a word to search
        System.out.print("Enter a word to search: ");
        String word = input.nextLine();

        // check whether word exists by using the contains()
        if (text.contains(word)) {
            System.out.println("Result: Word FOUND in the string");
        } else {
            System.out.println("Result: Word NOT FOUND in the string");
        }

        // Ask user for another string to compare
        System.out.print("Enter another string to compare: ");
        String other = input.nextLine();

        // Compare both strings
        if (text.equalsIgnoreCase(other)) {
            System.out.println("Comparison: Both strings are equal (ignore case)");
        } else {
            System.out.println("Comparison: Strings are not equal");
        }

        // Extract part of the string using substring
        if (text.length() > 4) {
            System.out.println("Substring (0,4): " + text.substring(0, 4));
        } else {
            System.out.println("String too short for substring operation");
        }

        // Check string length condition
        if (text.length() > 6) {
            System.out.println("Message: String length is greater than 6");
        } else {
            System.out.println("Message: String length is 6 or less");
        }

        // Close Scanner
        input.close();
    }
}