import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class q5 {
    public static void main(String[] args) {
        // Example paragraph
        String paragraph = "This is a sample paragraph. This paragraph is meant to be tokenized. Tokenized words will be sorted and stored without duplicates.";

        // Convert paragraph to lowercase, remove punctuation, and split into words
        String[] tokens = paragraph.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");

        // Use a TreeSet to store words, automatically removing duplicates and sorting them
        Set<String> uniqueWords = new TreeSet<>(Arrays.asList(tokens));

        // Convert the set to an array
        String[] sortedWords = uniqueWords.toArray(new String[0]);

        // Display the sorted array without duplicates
        System.out.println("Sorted words without duplicates:");
        for (String word : sortedWords) {
            System.out.println(word);
        }
    }
}
