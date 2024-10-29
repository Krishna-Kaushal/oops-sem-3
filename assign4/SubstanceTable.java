import java.util.Scanner;

public class SubstanceTable {
    private String[][] substanceTable;

    public SubstanceTable(String[][] substanceTable) {
        this.substanceTable = substanceTable;
    }

    public void checkTemperature(double temperature) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the substance name: ");
        String substanceName = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < substanceTable.length; i++) {
            if (substanceTable[i][0].equals(substanceName)) {
                found = true;
                if (temperature == Double.parseDouble(substanceTable[i][1])) {
                    System.out.println("The temperature matches the freezing point of " + substanceName);
                } else if (temperature == Double.parseDouble(substanceTable[i][2])) {
                    System.out.println("The temperature matches the boiling point of " + substanceName);
                } else {
                    System.out.println("The temperature does not match the freezing or boiling point of " + substanceName);
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Substance not found in the table");
        }
    }

    public static void main(String[] args) {
        String[][] substanceTable = {
                {"Water", "0.0", "100.0"},
                {"Ethanol", "-114.0", "78.3"},
                {"Methanol", "-97.6", "64.7"},
                {"Glycerol", "18.2", "290.0"}
        };

        SubstanceTable table = new SubstanceTable(substanceTable);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        table.checkTemperature(temperature);
    }
}