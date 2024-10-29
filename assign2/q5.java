import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your father's name: ");
        String fathersName = scanner.nextLine();
        
        System.out.print("Enter your date of birth (yyyy-mm-dd): ");
        String dobInput = scanner.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dob = LocalDate.parse(dobInput, formatter);
        LocalDate currentDate = LocalDate.now();
        
        Period age = Period.between(dob, currentDate);
        
        System.out.println("\nPersonal Record:");
        System.out.println("Name of the student: " + name);
        System.out.println("Father's name: " + fathersName);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");
    }
}
