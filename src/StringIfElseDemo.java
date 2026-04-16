public class StringIfElseDemo {

    public static void main(String[] args) {

        // Create a String variable for username
        String username = "Sultan123";

        // Display the entered username
        System.out.println("Username: " + username);

        // Use if statement to check username length
        if (username.length() > 5) {
            System.out.println("Username is valid (more than 5 characters)");
        } else {
            System.out.println("Username is too short");
        }

        // Create another String variable for password
        String password = "1234";

        // Use if statement to check password
        if (password.equals("1234")) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is incorrect");
        }

        // Use Contains()
        if (username.contains("a")) {
            System.out.println("Username contains letter 'a'");
        } else {
            System.out.println("Username does not contain letter 'a'");
        }

        // Use if to check username is empty or not
        if (username.isEmpty()) {
            System.out.println("Username is empty");
        } else {
            System.out.println("Username is not empty");
        }
    }
}