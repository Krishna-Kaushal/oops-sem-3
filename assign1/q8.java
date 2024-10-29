import java.util.Scanner;

public class q8 {
    public static void isPalindrome(int n) {
        int tmp = n;
        int rev = 0;

        while (tmp != 0) {
            rev = rev * 10 + (tmp % 10);
            tmp /= 10;
        }

        if (rev == n) {
            System.out.println("Yes, it's a palindrome");
        } else {
            System.out.println("No, it's not a palindrome");
        }
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPalindrome(n);
        sc.close();
    }
    
}