public class StringProcessDemo {

    // Main Method
    public static void main(String[] args) {

        // Create a String variable with a full employee record (with extra spaces)
        String record = "   Sultan, IT, sultan@email.com   ";

        // Display original string
        System.out.println("Original Record: '" + record + "'");

        // Use trim() to remove unnecessary spaces
        String cleanedRecord = record.trim();
        System.out.println("Cleaned Record: '" + cleanedRecord + "'");

        // Use split() to separate the record into parts
        String[] parts = cleanedRecord.split(",");

        // Display each part of the array
        System.out.println("Split Parts:");
        for (String part : parts) {
            System.out.println(part.trim()); // trim each part
        }

        // Create two String variables with same word in different cases
        String word1 = "JAVA";
        String word2 = "java";

        // Use equalsIgnoreCase() to compare them
        System.out.println("Are words equal (ignore case)? " + word1.equalsIgnoreCase(word2));

        // Use isEmpty() on another String variable
        String emptyText = "";
        System.out.println("Is the string empty? " + emptyText.isEmpty());
    }
}