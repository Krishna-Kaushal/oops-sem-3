import java.util.Scanner;

public class q10 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            count ++;
            n /= 10;
        }
        System.out.println(count);
        sc.close();
    }
}