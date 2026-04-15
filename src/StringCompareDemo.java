public class StringCompareDemo {

    // Main method
    public static void main(String[] args) {

        // Create a String variable with a sample word
        String word1 = "Sultan";

        // Display original string
        System.out.println("Original String: " + word1);

        // Use charAt() to display character at a specific position
        System.out.println("Character at position 2: " + word1.charAt(2));

        // Use substring() to extract part of the string
        System.out.println("Substring (0 to 3): " + word1.substring(0, 3));

        // Create another String variable
        String word2 = "Sultan";

        // Use equals() to compare both strings
        System.out.println("Are strings equal " + word1.equals(word2));

        // Try comparing two different strings
        String word3 = "Ali";
        System.out.println("Compare with different string: " + word1.equals(word3));
    }
}