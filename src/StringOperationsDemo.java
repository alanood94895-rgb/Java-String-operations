public class StringOperationsDemo {

    public static void main(String[] args) {   // Main method

        // Create String variable with customer name
        String name = "Sultan";

        // Display original string
        System.out.println("Name: " + name);

        // Use length() to display number of characters
        System.out.println("Length: " + name.length());

        // Use toUpperCase() to display uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // Use toLowerCase() to display lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // Create another String variable (company name)
        String companyName = "TechCompany";

        // Use concat()
        String combined = name.concat(" ").concat(companyName);

        // Display final combined string
        System.out.println("Combined String: " + combined);
    }
}