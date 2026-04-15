public class StringNestedLoopDemo {
    public static void main(String[] args) {

        // Create two String variables
        String text1 = "Java";
        String text2 = "JAVA";

        // Display both strings
        System.out.println("First String: " + text1);
        System.out.println("Second String: " + text2);

        // Use length()
        System.out.println("Length of first: " + text1.length());
        System.out.println("Length of second: " + text2.length());

        // Counter for matching characters
        int matchCount = 0;

        // Outer loop (first string)
        for (int i = 0; i < text1.length(); i++) {

            // (second string)
            for (int j = 0; j < text2.length(); j++) {

                // Compare characters using charAt()
                if (text1.charAt(i) == text2.charAt(j)) {

                    System.out.println("Matching character found: " + text1.charAt(i));
                    matchCount++;
                }
            }
        }

        // Display total matches
        System.out.println("Total Matching Characters: " + matchCount);


        // Second nested loop example

        String word1 = "hello";
        String word2 = "world";

        System.out.println("Word1: " + word1);
        System.out.println("Word2: " + word2);

        int secondMatchCount = 0;

        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {

                if (word1.charAt(i) == word2.charAt(j)) {
                    System.out.println("Common letter: " + word1.charAt(i));
                    secondMatchCount++;
                }
            }
        }

        System.out.println("Total common letters: " + secondMatchCount);
    }
}