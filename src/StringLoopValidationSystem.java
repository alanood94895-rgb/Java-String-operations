import java.util.Scanner;

public class StringLoopValidationSystem {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask user to enter a sample string
        System.out.print("Enter a sample string: ");
        String text = input.nextLine();

        // Display original string
        System.out.println("Original String: " + text);

        // Display length method
        System.out.println("Length: " + text.length());

        // Variable to count vowels
        int vowels = 0;

        // For loop to read each character
        for (int i = 0; i < text.length(); i++) {

            // Display each character
            System.out.println("Character: " + text.charAt(i));

            // Get character for checking vowels
            char ch = text.charAt(i);

            // Count Vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            }
        }

        // Display total vowels
        System.out.println("Total Vowels: " + vowels);

        // Ask user to enter a word to search
        System.out.print("Enter a word to search: ");
        String word = input.nextLine();

        // Check if word exists in string
        if (text.contains(word)) {
            System.out.println("Result: Word found in the string");
        } else {
            System.out.println("Result: Word NOT found in the string");
        }

        // Check length condition
        if (text.length() > 20) {
            System.out.println("Message: String is long");
        } else {
            System.out.println("Message: String is short");
        }

        // Close scanner
        input.close();
    }
}