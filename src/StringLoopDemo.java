public class StringLoopDemo {

    // Main Method
    public static void main(String[] args) {

        // Create a String variable
        String text = "Java Programming 2026";

        // Display original string
        System.out.println("Original String: " + text);

        // Use length() to find total number of characters
        System.out.println("Length: " + text.length());

        // Counters
        int vowels = 0;
        int consonants = 0;
        int digits = 0;


        // Use for loop to go through each character
        for (int i = 0; i < text.length(); i++) {

            // Get each character using charAt()
            System.out.println("Java Programming 2026");
            String word = "Java";
            System.out.println("First letter: " + word.charAt(word.length() - 1));
            Character charAtIndexOfWord = word.charAt(i);


            // Display counts
            System.out.println("Total Vowels: " + vowels);
            System.out.println("Total Consonants: " + consonants);
            System.out.println("Total Digits: " + digits);
        }
    }
}