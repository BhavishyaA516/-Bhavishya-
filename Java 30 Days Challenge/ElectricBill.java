import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElectricBill {

    public static boolean isValidSerialNumber(String serialNumber) {
        return serialNumber.length() == 13 && serialNumber.matches("\\d+");
    }

    public static double calculateBill(int units) {
        double cost;
        if (units < 100) {
            cost = units * 3.0;
        } else if (units < 300) {
            cost = units * 4.0;
        } else if (units < 500) {
            cost = units * 5.0;
        } else {
            cost = units * 7.0;
        }
        return cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> previousBills = new HashMap<>();

        while (true) {
            System.out.println("Welcome to the Electricity Bill Payment:");
            System.out.println("Press 1 to Enter");
            System.out.println("Press 0 to Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) {
                System.out.println("Exiting the system. Have a Goodbye!");
                break;
            } else if (choice == 1) {
                System.out.print("Enter your 13-digit serial number: ");
                String serialNumber = sc.nextLine();

                if (!isValidSerialNumber(serialNumber)) {
                    System.out.println("Invalid serial number. Exiting...");
                    break;
                }

                while (true) {
                    System.out.println("Menu:");
                    System.out.println("1. View Previous Bills");
                    System.out.println("2. Enter Number of Units for this Month");
                    System.out.println("0. Exit");

                    int menuOption = sc.nextInt();

                    if (menuOption == 0) {
                        System.out.println("Returning to main menu...");
                        break;
                    } else if (menuOption == 1) {
                        if (previousBills.containsKey(serialNumber)) {
                            System.out.println("Previous Bill: "
                                    + String.format("%.2f", previousBills.get(serialNumber)) + " INR");
                        } else {
                            System.out.println("Previous bills not found.");
                        }
                    } else if (menuOption == 2) {
                        System.out.print("Enter number of units consumed this month: ");
                        int units = sc.nextInt();

                        double billAmount = calculateBill(units);
                        previousBills.put(serialNumber, billAmount);

                        System.out.println("Total amount to be paid: " + String.format("%.2f", billAmount) + " INR");
                    } else {
                        System.out.println("Invalid option...!..!Please try again.");
                    }
                }
            } else {
                System.out.println("Invalid choice...!  Please try again.");
            }
        }

        sc.close();
    }
}
