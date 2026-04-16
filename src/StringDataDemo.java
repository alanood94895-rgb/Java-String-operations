public class StringDataDemo {

    // Main Method
    public static void main(String[] args) {

        // Create a String variable with a sample sentence
        String text = "java is a fantastic language ";

        // Display original string
        System.out.println("Original String: " + text);

        // Use toUpperCase() to convert to uppercase
        System.out.println("Uppercase: " + text.toUpperCase());

        // Use toLowerCase() to convert to lowercase
        System.out.println("Lowercase: " + text.toLowerCase());

        // Use indexOf() to find position of a word
        System.out.println("Position of 'fantastic': " + text.indexOf("fantastic"));

        // Use substring() to extract part of the string
        String part = text.substring(0, 10);
        System.out.println("Extracted Text: " + part);

        // Use contains() to check if string includes a word
        System.out.println("Contains 'Java'? " + text.contains("Java"));
    }
}