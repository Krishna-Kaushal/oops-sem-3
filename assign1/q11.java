import java.util.Scanner;

public class q11 {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = Math.min(a, b);
        while (res > 0)  {
            if (a % res == 0 && b % res == 0) {
                System.out.println(res);
                break;
            }
            res--;
        }
        sc.close();

    }
}