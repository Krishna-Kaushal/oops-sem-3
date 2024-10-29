import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class TokenProcessor {
    private String paragraph;
    private int tokenSize;

    public TokenProcessor(String paragraph, int tokenSize) {
        this.paragraph = paragraph;
        this.tokenSize = tokenSize;
    }

    public String[] processTokens() {
        // Generate tokens of fixed size
        Set<String> uniqueTokens = new TreeSet<>();
        for (int i = 0; i <= paragraph.length() - tokenSize; i += tokenSize) {
            String token = paragraph.substring(i, i + tokenSize);
            uniqueTokens.add(token); // TreeSet automatically handles duplicates and sorting
        }

        // Convert the set to an array
        return uniqueTokens.toArray(new String[0]);
    }
}

public class q6 {
    public static void main(String[] args) {
        // Example paragraph (continuous alphabets)
        String paragraph = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";

        // Specify the token size (e.g., 5)
        int tokenSize = 5;

        // Create an instance of TokenProcessor
        TokenProcessor processor = new TokenProcessor(paragraph, tokenSize);

        // Process tokens
        String[] sortedTokens = processor.processTokens();

        // Display the sorted array without duplicates
        System.out.println("Sorted tokens without duplicates:");
        for (String token : sortedTokens) {
            System.out.println(token);
        }
    }
}
