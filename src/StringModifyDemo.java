public class StringModifyDemo {

    // Main Method
    public static void main(String[] args) {

        // Create a String variable with extra spaces
        String text = "   Java is very powerful language   ";

        // Display original string
        System.out.println("Original String: '" + text + "'");

        // Use trim() to remove leading and trailing spaces
        String trimmedText = text.trim();
        System.out.println("Trimmed String: '" + trimmedText + "'");

        // Use contains() to check whether string contains a word
        System.out.println("Contains 'Java'? " + trimmedText.contains("Java"));

        // Use replace() to change one word in the string
        String updatedText = trimmedText.replace("powerful", "easy");

        // Display updated string
        System.out.println("Updated String: '" + updatedText + "'");
    }
}