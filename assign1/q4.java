import java.util.Scanner;

class q4 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("The input is Even");
        } else {
            System.out.println("The input is Odd");
        }
    }
}