public class StringPositionDemo {

    // Main method
    public static void main(String[] args) {

        // Create a String variable with a sample text
        String text = "Java Programming Language";

        // Display original string
        System.out.println("Original String: " + text);

        // Use indexOf() to find position of a character or word
        System.out.println("Position of 'Programming': " + text.indexOf("Programming"));

        // Use startsWith() to check if string starts with a word
        System.out.println("Starts with 'Java'? " + text.startsWith("Java"));

        // Use endsWith() to check if string ends with a word
        System.out.println("Ends with 'Language'? " + text.endsWith("Language"));
    }
}