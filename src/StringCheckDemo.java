public class StringCheckDemo {

    // Main Method
    public static void main(String[] args) {

        // Create a String variable with a sample message
        String message = "i like java language";

        // Display original string
        System.out.println("Original Message: " + message);

        // Use substring() to extract part of the message
        String part = message.substring(0, 10);
        System.out.println("Extracted Text: " + part);

        // Use replace() to change one word
        String updatedMessage = message.replace("powerful", "easy");
        System.out.println("Updated Message: " + updatedMessage);

        // Use contains()
        System.out.println("Contains 'Java'? " + message.contains("Java"));

        // Use charAt() to display character at a specific position
        System.out.println("Character at position 5: " + message.charAt(5));

        // Create another String variable
        String secondText = "  Hello World  ";

        // Perform another String operation (trim)
        String cleanedText = secondText.trim();

        // Display final result
        System.out.println("Second Text after trim: '" + cleanedText + "'");
    }
}