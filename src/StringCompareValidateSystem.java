import java.util.Scanner;

public class StringCompareValidateSystem {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask user to enter a sample string
        System.out.print("Enter a sample string: ");
        String text = input.nextLine();

        // Display original string
        System.out.println("Original String: " + text);

        // Display length of string
        System.out.println("Length: " + text.length());

        // Ask user to enter another string for comparison
        System.out.print("Enter another string to compare: ");
        String other = input.nextLine();

        // Compare both strings using equals()
        if (text.equals(other)) {
            System.out.println("Result: Strings are EQUAL");
        } else {
            System.out.println("Result: Strings are NOT equal");
        }

        // Ask user to enter prefix
        System.out.print("Enter prefix to check: ");
        String prefix = input.nextLine();

        // Check startsWith()
        if (text.startsWith(prefix)) {
            System.out.println("Result: String starts with '" + prefix + "'");
        } else {
            System.out.println("Result: String does NOT start with '" + prefix + "'");
        }

        // Ask user to enter suffix
        System.out.print("Enter suffix to check: ");
        String suffix = input.nextLine();

        // Check endsWith()
        if (text.endsWith(suffix)) {
            System.out.println("Result: String ends with '" + suffix + "'");
        } else {
            System.out.println("Result: String does NOT end with '" + suffix + "'");
        }

        // Check length condition using if-else
        if (text.length() > 8) {
            System.out.println("Message: String length is greater than 8");
        } else {
            System.out.println("Message: String length is 8 or less");
        }

        // Close scanner
        input.close();
    }
}