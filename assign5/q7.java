import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class TokenProcessor {
    private String paragraph;
    private char delimiter;

    // Constructor to initialize paragraph and delimiter
    public TokenProcessor(String paragraph, char delimiter) {
        this.paragraph = paragraph;
        this.delimiter = delimiter;
    }

    // Method to process the paragraph into sorted tokens without duplicates
    public String[] processTokens() {
        // Split the paragraph into tokens based on the delimiter
        String[] tokens = paragraph.split(String.valueOf(delimiter));

        // Use a TreeSet to store the tokens, ensuring they are sorted and unique
        Set<String> uniqueTokens = new TreeSet<>(Arrays.asList(tokens));

        // Convert the set to an array
        return uniqueTokens.toArray(new String[0]);
    }
}

public class q7 {
    public static void main(String[] args) {
        // Example paragraph (continuous alphabets)
        String paragraph = "abcdefghijklmno,pqrstuv,wxyzabc,de,fghij";

        // Specify the delimiter (e.g., ',')
        char delimiter = ',';

        // Create an instance of TokenProcessor
        TokenProcessor processor = new TokenProcessor(paragraph, delimiter);

        // Process tokens
        String[] sortedTokens = processor.processTokens();

        // Display the sorted array without duplicates
        System.out.println("Sorted tokens without duplicates:");
        for (String token : sortedTokens) {
            System.out.println(token);
        }
    }
}
