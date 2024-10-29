import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class q7{
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the length (float): ");
            float length = Float.parseFloat(reader.readLine());

            System.out.print("Enter the breadth (double): ");
            double breadth = Double.parseDouble(reader.readLine());

            int intLength = (int) length;
            int intBreadth = (int) breadth;

            double perimeter = 2 * (intLength + intBreadth);

            System.out.println("Computed perimeter (as double): " + perimeter);

        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers.");
        }
    }
}
