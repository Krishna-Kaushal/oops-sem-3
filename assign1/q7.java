import java.util.Scanner;

class q7 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tmp = num, remainder, count = 0, res = 0;

        while (tmp != 0) {
            count ++;
            tmp /= 10;
        }
        tmp = num;

        while (tmp != 0) {
            remainder = tmp % 10; 
            tmp /= 10;
            res += Math.pow(remainder, count);
        }
        
        if (res == num) {
            System.out.println("Yes, it's an Armstrong number.");
        } else {
            System.out.println("No, it's not an Armstrong number.");
        }
    }
}