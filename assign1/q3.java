import java.util.Scanner;

class q3 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println(area);
        sc.close();
    }
}