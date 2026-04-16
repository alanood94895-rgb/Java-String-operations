public class StringDoWhileDemo {
    public static void main(String[] args) {

        // Create a String variable
        String text = "Java Programming 2026";

        // Display original string
        System.out.println("Original String: " + text);

        // Use length()
        System.out.println("Length: " + text.length());

        // Counters
        int i = 0;
        int lowercase = 0;
        int spaces = 0;

        // do-while loop
        do {

            // display each character directly
            System.out.println(text.charAt(i));

            // count lowercase letters directly using charAt()
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                lowercase++;
            }

            // count spaces directly using charAt()
            else if (text.charAt(i) == ' ') {
                spaces++;
            }

            // increase counter
            i++;

        } while (i < text.length());

        // display results
        System.out.println("Total Lowercase Letters: " + lowercase);
        System.out.println("Total Spaces: " + spaces);
    }
}