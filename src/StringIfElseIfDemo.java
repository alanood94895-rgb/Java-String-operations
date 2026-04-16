public class StringIfElseIfDemo {

    public static void main(String[] args) {

        // Create a String variable
        String text = "JavaCourse";

        // Display the original string
        System.out.println("Text: " + text);

        // Check if string is empty
        if (text.isEmpty()) {
            System.out.println("String is empty");

            // Check if string length is less than 5
        } else if (text.length() < 5) {
            System.out.println("String is too short");

            // Check if string starts with a specific letter or word
        } else if (text.startsWith("Ja")) {
            System.out.println("String starts with 'Ja'");

            // Check if string ends with a specific letter or symbol
        } else if (text.endsWith("se")) {
            System.out.println("String ends with 'se'");

            // Compare using equalsIgnoreCase()
        } else if (text.equalsIgnoreCase("javacourse")) {
            System.out.println("String matches 'javacourse' (ignore case)");

            // Default Message
        } else {
            System.out.println("No condition matched");
        }
    }
}