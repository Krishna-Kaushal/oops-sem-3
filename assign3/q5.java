import java.util.Scanner;

class Test {
    // fields
    public int m1;
    public int m2;
    public int m3;

    // constructor 
    public Test (int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // accessors
    public int getM1() {return m1;}
    public int getM2() {return m2;}
    public int getM3() {return m3;}

    // modifiers
    public void setM1() {this.m1 = m1;}
    public void setM2() {this.m2 = m2;}
    public void setM3() {this.m3 = m3;}

    // methods
    public int average () {
        return (m1 + m2 + m3) / 3;
    }
}

public class q5 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int [3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        Test t1 = new Test (a[0], a[1], a[2]);
        System.out.println(t1.average());
    }
}