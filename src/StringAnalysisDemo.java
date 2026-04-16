public class StringAnalysisDemo {

    // Main Method
    public static void main(String[] args) {

        // Create a String variable with a sample text
        String text1 = "Java Programming language";

        // Display original string
        System.out.println("Original String: " + text1);

        // Use length() to display total number of characters
        System.out.println("Length: " + text1.length());

        // Create another String variable
        String text2 = "Java Programming language";

        // Use equals() to compare both strings
        System.out.println("Are both strings equal" + text1.equals(text2));

        // Use indexOf() to find position of a word
        System.out.println("Position of 'Programming': " + text1.indexOf("Programming"));

        // Use startsWith() to check beginning
        System.out.println("Starts with 'Java'? " + text1.startsWith("Java"));

        // Use endsWith() to check ending
        System.out.println("Ends with 'language'? " + text1.endsWith("language"));
    }
}