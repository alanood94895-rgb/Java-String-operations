import java.util.Scanner;

public class StringSearchModifySystem {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask user to enter a Sample string
        System.out.print("Enter a sample string: ");
        String text = input.nextLine();

        // Display original string
        System.out.println("Original String: " + text);

        // Ask user to search a word
        System.out.print("Enter a word to search: ");
        String searchWord = input.nextLine();

        // Check if word exists using contains()
        if (text.contains(searchWord)) {
            System.out.println("Result: Word FOUND in the string");
        } else {
            System.out.println("Result: Word NOT FOUND in the string");
        }

        // Ask user for word to replace
        System.out.print("Enter word to replace: ");
        String oldWord = input.nextLine();

        // Ask user for new word
        System.out.print("Enter new word: ");
        String newWord = input.nextLine();

        // Replace word in string
        String modifiedText = text.replace(oldWord, newWord);

        // Display modified string
        System.out.println("Modified String: " + modifiedText);

        // Extract part of modified string using substring
        if (modifiedText.length() > 3) {
            System.out.println("Substring (0,3): " + modifiedText.substring(0, 3));
        } else {
            System.out.println("String too short for substring");
        }

        // Display one character using charAt()
        if (modifiedText.length() > 0) {
            System.out.println("Character at index 0: " + modifiedText.charAt(0));
        }

        // Check length condition
        if (modifiedText.length() > 8) {
            System.out.println("Message: Modified string has more than 8 characters");
        } else {
            System.out.println("Message: Modified string has 8 or fewer characters");
        }

        // Close scanner
        input.close();
    }
}