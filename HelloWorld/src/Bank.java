import java.util.*;

public class Bank {
    private static List<Banking> banks = new ArrayList<>(); // Store multiple bank instances
    private static Scanner scanner = new Scanner(System.in); // Single scanner instance

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nChoose a bank to manage or create a new one:");
            System.out.println("1. Create a new bank");
            System.out.println("2. Select an existing bank");
            System.out.println("3. Exit");

            int mainChoice = getUserInput(1, 3);

            if (mainChoice == 1) {
                Banking newBank = new Banking(); // Assuming Banking is another class
                banks.add(newBank);
                System.out.println("New bank created! Bank ID: " + (banks.size() - 1));
            } else if (mainChoice == 2) {
                if (banks.isEmpty()) {
                    System.out.println("No banks available. Create one first.");
                    continue;
                }

                System.out.println("Available Banks:");
                for (int i = 0; i < banks.size(); i++) {
                    System.out.println(i + ": Bank " + (i + 1));
                }

                System.out.print("Enter bank ID: ");
                int bankId = getUserInput(0, banks.size() - 1);
                manageBank(banks.get(bankId));
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
    }

    private static void manageBank(Banking bank) {
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Account Balances");
            System.out.println("4. Back to Main Menu");

            int choice = getUserInput(1, 4);

            if (choice == 1) {
                bank.deposit();
            } else if (choice == 2) {
                bank.withdraw();
            } else if (choice == 3) {
                bank.showBalances();
            } else {
                break;
            }
        }
    }

    private static int getUserInput(int min, int max) {
        int input;
        while (true) {
            try {
                input = scanner.nextInt();
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("Invalid choice, try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}
