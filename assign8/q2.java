import java.io.*;
import java.util.*;

class ParagraphProcessor {
    // Method to tokenize paragraph and return sorted unique words
    public String[] processParagraph(String paragraph) {
        // Split paragraph into words (tokens) using regex
        String[] words = paragraph.toLowerCase().split("\\W+");

        // Use a TreeSet to store words in sorted order and eliminate duplicates
        Set<String> uniqueWords = new TreeSet<>(Arrays.asList(words));

        // Convert the Set back to an array
        return uniqueWords.toArray(new String[0]);
    }

    // Method to handle file input and output
    public void processFiles(String inputFilePath, String outputFilePath) {
        try {
            // Reading paragraph from the input file
            File inputFile = new File(inputFilePath);
            Scanner inputScanner = new Scanner(inputFile);
            StringBuilder paragraph = new StringBuilder();

            // Read entire file content
            while (inputScanner.hasNextLine()) {
                paragraph.append(inputScanner.nextLine()).append(" ");
            }
            inputScanner.close();

            // Process the paragraph into sorted unique words
            String[] sortedUniqueWords = processParagraph(paragraph.toString());

            // Writing sorted words to the output file
            FileWriter outputWriter = new FileWriter(outputFilePath);
            for (String word : sortedUniqueWords) {
                outputWriter.write(word + "\n");
            }
            outputWriter.close();

            System.out.println("Words processed and stored in " + outputFilePath + "!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
        } catch (IOException e) {
            System.out.println("Error: Problem writing to the output file.");
        }
    }
}

public class q2 {
    public static void main(String[] args) {
        // Create an instance of ParagraphProcessor class
        ParagraphProcessor processor = new ParagraphProcessor();

        // Input and output file paths
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Process the files
        processor.processFiles(inputFilePath, outputFilePath);
    }
}
