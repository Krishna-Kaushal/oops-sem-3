import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class q9{
    
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Enter integer number 1: ");
            int num1 = Integer.parseInt(reader.readLine());
            
            System.out.print("Enter integer number 2: ");
            int num2 = Integer.parseInt(reader.readLine());
            
            System.out.print("Enter integer number 3: ");
            int num3 = Integer.parseInt(reader.readLine());
            
            System.out.print("Enter integer number 4: ");
            int num4 = Integer.parseInt(reader.readLine());
            
            System.out.print("Enter integer number 5: ");
            int num5 = Integer.parseInt(reader.readLine());
            
            // Calculate GCD
            int gcd12 = gcd(num1, num2);
            int gcd123 = gcd(gcd12, num3);
            int gcd1234 = gcd(gcd123, num4);
            int finalGcd = gcd(gcd1234, num5);
            
            // Calculate LCM
            long lcm12 = lcm(num1, num2);
            long lcm123 = lcm(lcm12, num3);
            long lcm1234 = lcm(lcm123, num4);
            long finalLcm = lcm(lcm1234, num5);
            
            System.out.println("Greatest Common Divisor (GCD): " + finalGcd);
            System.out.println("Least Common Multiple (LCM): " + finalLcm);
            
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integer numbers.");
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return (a * b) / gcd((int) a, (int) b);
    }
}
