import java.util.Scanner;

class q5 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean isPrime = true;

        if (a == 0 || a == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < a/2; i++) {
                if (a % i == 0) isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
    }
}