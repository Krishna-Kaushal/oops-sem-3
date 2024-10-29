import java.io.*;

class ArrayFileHandler {

    // Static method to write an array to a binary file
    public static void writeArray(String fileName, int[] array) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            // Write the length of the array first
            outputStream.writeInt(array.length);
            
            // Write each element of the array to the file
            for (int num : array) {
                outputStream.writeInt(num);
            }
            
            System.out.println("Array successfully written to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Static method to read an array from a binary file
    public static void readArray(String fileName, int[] array) {
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(fileName))) {
            // Read the length of the array from the file
            int length = inputStream.readInt();
            
            // Ensure the array has enough space to store the data
            if (length > array.length) {
                System.out.println("Error: Array is too small to hold the data.");
                return;
            }

            // Read each element from the file into the array
            for (int i = 0; i < length; i++) {
                array[i] = inputStream.readInt();
            }

            System.out.println("Array successfully read from the file.");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

public class q7 {
    public static void main(String[] args) {
        // Create an array of integers
        int[] arrayToWrite = {10, 20, 30, 40, 50};
        String fileName = "arrayData.bin";  // File to store the array data

        // Write the array to the file
        ArrayFileHandler.writeArray(fileName, arrayToWrite);

        // Create an array to hold the data that will be read from the file
        int[] arrayToRead = new int[arrayToWrite.length];

        // Read the array from the file
        ArrayFileHandler.readArray(fileName, arrayToRead);

        // Display the array read from the file
        System.out.println("Array read from file:");
        for (int num : arrayToRead) {
            System.out.print(num + " ");
        }
    }
}
