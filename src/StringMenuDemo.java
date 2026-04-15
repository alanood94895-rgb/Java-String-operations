import java.util.Scanner;

public class StringMenuDemo {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask user to enter a sample string
        System.out.print("Enter a sample string: ");
        String text = input.nextLine(); //read user input

        // Display output
        System.out.println("\nOriginal String: " + text);

        // Display 5 menu options
        System.out.println("  String Menu");
        System.out.println("1- Display length of string");
        System.out.println("2- Convert to UPPERCASE");
        System.out.println("3- Convert to lowercase");
        System.out.println("4- Check if string contains a word");
        System.out.println("5- Compare string (equalsIgnoreCase)");

        // Ask user for choice
        System.out.print("Enter your choice (1-5): ");
        int choice = input.nextInt();
        input.nextLine(); // clear buffer

        // Process menu using switch
        switch (choice) {

            case 1:
                System.out.println("Length: " + text.length());
                break;

            case 2:
                System.out.println("Uppercase: " + text.toUpperCase());
                break;

            case 3:
                System.out.println("Lowercase: " + text.toLowerCase());
                break;

            case 4:
                System.out.print("Enter word to search: ");
                String word = input.nextLine();
                System.out.println("Contains: " + text.contains(word));
                break;

            case 5:
                System.out.print("Enter another string to compare: ");
                String other = input.nextLine();
                System.out.println("Equal (ignore case): " + text.equalsIgnoreCase(other));
                break;

            default:
                System.out.println(" Please select a valid option");
        }

        // Close scanner
        input.close();
    }
}