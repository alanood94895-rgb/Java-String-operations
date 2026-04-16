public class StringWhileDemo {
    public static void main(String[] args) {

        // Create a String variable
        String text = "Java Programming 2026";

        // Display original string
        System.out.println("Original String: " + text);

        // Use length() to find total characters
        System.out.println("Length: " + text.length());

        // Counter variable
        int i = 0;

        // Counters for spaces and uppercase letters
        int spaces = 0;
        int upperCase = 0;

        // while loop
        while (i < text.length()) {

            // use charAt()
            System.out.println("ava Programming 2026");
            String word = "Java";
            System.out.println("First letter: " + word.charAt(word.length() - 1));
            Character charAtIndexOfWord = word.charAt(1);

        }

        // Display results
        System.out.println("Total Spaces: " + spaces);
        System.out.println("Total Uppercase Letters: " + upperCase);
    }
}