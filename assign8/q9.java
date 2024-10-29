import java.io.*;

class FileDecryptor {

    // Method to decrypt the content of the encrypted file and write to another file
    public static void decryptFile(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            
            int character;
            // Read each encrypted character from the input file
            while ((character = reader.read()) != -1) {
                // Decrypt the character by subtracting 10 from its ASCII value
                character -= 10;
                // Write the decrypted character to the output file
                writer.write(character);
            }

            System.out.println("File decryption successful. Decrypted content written to: " + outputFile);
        } catch (IOException e) {
            System.out.println("Error during file decryption: " + e.getMessage());
        }
    }
}

public class q9 {
    public static void main(String[] args) {
        // Define the encrypted and decrypted file paths
        String encryptedFile = "encryptedFile.txt";  // File produced by the encryption program
        String decryptedFile = "decryptedFile.txt";   // File to store the decrypted content

        // Step: Decrypt the encrypted file and save the result in the decrypted file
        FileDecryptor.decryptFile(encryptedFile, decryptedFile);
    }
}
