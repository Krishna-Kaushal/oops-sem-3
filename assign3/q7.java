import java.util.Scanner;

class MonthDays {
    // fields
    int month;
    int year;

    // constructor
    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }

    // methods
    private boolean isLeapYear() {
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else {
            return year % 4 == 0;
        }
    }

    public int getNumberOfDays() {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear() ? 29 : 28;
            default:
                return 0; // Invalid month
        }
    }
}

public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        MonthDays monthDays = new MonthDays(month, year);
        int days = monthDays.getNumberOfDays();

        if (days > 0) {
            System.out.println(days + " days");
        } else {
            System.out.println("Invalid month.");
        }

        scanner.close();
    }
}