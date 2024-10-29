import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class q6{
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your father's name: ");
            String fathersName = reader.readLine();

            System.out.print("Enter your date of birth (yyyy-mm-dd): ");
            String dobInput = reader.readLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate dob = LocalDate.parse(dobInput, formatter);
            LocalDate currentDate = LocalDate.now();

            Period age = Period.between(dob, currentDate);

            System.out.println("\nPersonal Record:");
            System.out.println("Name of the student: " + name);
            System.out.println("Father's name: " + fathersName);
            System.out.println("Date of Birth: " + dob);
            System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");

        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }
    }
}
