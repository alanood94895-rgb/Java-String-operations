public class StringValidationDemo {

    // Main Method
    public static void main(String[] args) {

        // Create a String variable with a sample text
        String text = "Alanoud @ email.com";

        // Display original string
        System.out.println("Original String: " + text);

        // Use startsWith() to check beginning
        System.out.println("Starts with 'Alanoud'? " + text.startsWith("Alanoud"));

        // Use endsWith() to check ending (email domain)
        System.out.println("Ends with '.com'? " + text.endsWith(".com"));

        // Use replace() to change part of the string
        String updatedText = text.replace("email", "company");
        System.out.println("Updated String: " + updatedText);

        // Use substring() to extract part of the string
        String part = text.substring(0, 10);
        System.out.println("Extracted Text: " + part);

        // Use length() to display total characters
        System.out.println("Length: " + text.length());
    }
}