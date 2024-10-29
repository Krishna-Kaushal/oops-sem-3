import java.io.*;

class FileEncryptor {
    
    // Method to encrypt the content of the input file and write to the output file
    public static void encryptFile(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            
            int character;
            // Read each character from the input file
            while ((character = reader.read()) != -1) {
                // Encrypt the character by adding 10 to its ASCII value
                character += 10;
                // Write the encrypted character to the output file
                writer.write(character);
            }

            System.out.println("File encryption successful.");
        } catch (IOException e) {
            System.out.println("Error during file encryption: " + e.getMessage());
        }
    }

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

            System.out.println("File decryption successful.");
        } catch (IOException e) {
            System.out.println("Error during file decryption: " + e.getMessage());
        }
    }
}

public class q8 {
    public static void main(String[] args) {
        // Define the input, encrypted, and decrypted file paths
        String inputFile = "originalFile.txt";
        String encryptedFile = "encryptedFile.txt";
        String decryptedFile = "decryptedFile.txt";

        // Step 1: Encrypt the original file and save the result in the encrypted file
        FileEncryptor.encryptFile(inputFile, encryptedFile);

        // Step 2: Decrypt the encrypted file and save the result in the decrypted file
        FileEncryptor.decryptFile(encryptedFile, decryptedFile);
    }
}
