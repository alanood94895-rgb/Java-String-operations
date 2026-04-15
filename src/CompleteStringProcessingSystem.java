import java.util.Scanner;

public class CompleteStringProcessingSystem {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a sample string: ");
        String text = input.nextLine();

        // Display original string
        System.out.println("Original String: " + text);

        // Length of string
        System.out.println("Total Characters: " + text.length());

        // Uppercase
        System.out.println("Uppercase: " + text.toUpperCase());

        // Lowercase
        System.out.println("Lowercase: " + text.toLowerCase());

        // Search word
        System.out.print("Enter a word to search: ");
        String searchWord = input.nextLine();

        System.out.println("Contains word? " + text.contains(searchWord));

        // Compare strings
        System.out.print("Enter another string to compare: ");
        String compareText = input.nextLine();

        System.out.println("Strings equal (ignore case)? " +
                text.equalsIgnoreCase(compareText));

        // First character using charAt()
        System.out.println("First character: " + text.charAt(0));

        // Loop through string characters
        int vowels = 0;

        System.out.println("Characters in string:");

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // display each character
            System.out.println(ch);

            // vowel counting using switch (alternative to if-condition)
            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
                    break;
            }
        }

        // Display vowel count
        System.out.println("Total Vowels: " + vowels);

        // If-else condition for length
        if (text.length() > 10) {
            System.out.println("Message: String is long");
        } else {
            System.out.println("Message: String is short");
        }

        // Close scanner
        input.close();
    }
}