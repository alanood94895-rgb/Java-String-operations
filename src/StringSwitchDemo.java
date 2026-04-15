public class StringSwitchDemo {

    public static void main(String[] args) {

        // Create a String variable
        String role = "Manager";

        // Display the original string
        System.out.println("Role: " + role);

        // Switch statement using String
        switch (role) {

            case "Admin":
                System.out.println("You have full system access");
                break;

            case "Manager":
                System.out.println("You can manage team and reports");
                break;

            case "User":
                System.out.println("You have limited access");
                break;

            default:
                System.out.println("Unknown role");
                break;
        }

        // Test with another value
        role = "User";
        System.out.println("Role: " + role);

        switch (role) {

            case "Admin":
                System.out.println("You have full system access");
                break;

            case "Manager":
                System.out.println("You can manage team and reports");
                break;

            case "User":
                System.out.println("You have limited access");
                break;

            default:
                System.out.println("Unknown role");
                break;
        }

        // Test with a non-matching value
        role = "Guest";
        System.out.println("Role: " + role);

        switch (role) {

            case "Admin":
                System.out.println("You have full system access");
                break;

            case "Manager":
                System.out.println("You can manage team and reports");
                break;

            case "User":
                System.out.println("You have limited access");
                break;

            default:
                System.out.println("Unknown role");
                break;
        }
    }
}