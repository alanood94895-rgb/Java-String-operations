public class StringRecordDemo {

    // Main Method
    public static void main(String[] args) {

        // Create a String variable with extra spaces
        String record = " Sultan, IT, Oman   ";

        // Display original string
        System.out.println("Original Record: '" + record + "'");

        // Use trim()
        String cleanedRecord = record.trim();
        System.out.println("Cleaned Record: '" + cleanedRecord + "'");

        // Create two String variables with same word in different cases
        String word1 = "JAVA";
        String word2 = "java";

        // Use equalsIgnoreCase() to compare them
        System.out.println("Are words equal (ignore case) " + word1.equalsIgnoreCase(word2));

        // Use split()
        String[] parts = cleanedRecord.split(",");

        // Display each part
        System.out.println("Split Parts:");
        for (String part : parts) {
            System.out.println(part.trim());
        }

        // Create another empty String variable
        String emptyText = "";

        // Use isEmpty()
        System.out.println("Is the string empty? " + emptyText.isEmpty());

        // Use charAt()
        System.out.println("Character at position 2: " + cleanedRecord.charAt(2));
    }
}