public class StringReverseDemo {
    public static void main(String[] args) {

        // Create a String variable
        String text = "Java Programming";

        // Display original string
        System.out.println("Original String: " + text);

        // Use length()
        System.out.println("Length: " + text.length());


        // Forward loop (first to last character)

        System.out.println("Forward Reading:");

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }

        //  Reverse loop

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.println(text.charAt(i));
            reversed = reversed + text.charAt(i);
        }

        // Display reversed string
        System.out.println("Reversed String: " + reversed);

        // Count specific character
        char target = 'a';
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Character '" + target + "' appears: " + count + " times");

        // Visual comparison
        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);
    }
}