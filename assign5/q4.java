import java.util.Arrays;
import java.util.Comparator;

public class q4 {
    public static void main(String[] args) {
        // Create an array of 10 strings
        String[] strings = {"Banana", "apple", "Orange", "Mango", "grape", "Pineapple", "kiwi", "pear", "watermelon", "cherry"};

        // Sort the array in ascending order (case-insensitive)
        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);

        // Display the sorted array
        System.out.println("Case-Insensitive Sort:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
