import java.io.*;
import java.util.Scanner;

class DecimalToBinaryConverter {
    // Method to convert decimal to binary
    public String convertToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    // Method to handle file input and output
    public void processFiles(String inputFilePath, String outputFilePath) {
        try {
            // Reading from the input file
            File inputFile = new File(inputFilePath);
            Scanner inputScanner = new Scanner(inputFile);
            int decimalNumber = inputScanner.nextInt();
            inputScanner.close();

            // Converting decimal to binary
            String binaryString = convertToBinary(decimalNumber);

            // Writing to the output file
            FileWriter outputWriter = new FileWriter(outputFilePath);
            outputWriter.write(binaryString);
            outputWriter.close();

            System.out.println("Conversion completed and stored in " + outputFilePath + "!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
        } catch (IOException e) {
            System.out.println("Error: Problem writing to the output file.");
        }
    }
}

public class q1 {
    public static void main(String[] args) {
        // Create an instance of the converter class
        DecimalToBinaryConverter converter = new DecimalToBinaryConverter();

        // Input and output file paths
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Perform file processing and conversion
        converter.processFiles(inputFilePath, outputFilePath);
    }
}
