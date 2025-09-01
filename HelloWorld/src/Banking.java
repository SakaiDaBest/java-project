import java.util.HashMap;
import java.util.Scanner;

public class Banking {
    private HashMap<Integer, Integer> accountBalances = new HashMap<>(); // Stores account ID and balance
    private static int nextAccountID = 1; // Generates unique account IDs
    private Scanner scanner = new Scanner(System.in);

    // Method to create a new account
    public void createAccount() {
        int accountID = nextAccountID++;
        accountBalances.put(accountID, 0);
        System.out.println("New account created! Account ID: " + accountID);
    }

    // Deposit method
    public void deposit() {
        System.out.print("Enter account ID: ");
        int accountID = scanner.nextInt();
        if (!accountBalances.containsKey(accountID)) {
            System.out.println("Account not found!");
            return;
        }

        System.out.print("Enter deposit amount (must be > 0): ");
        int dep;
        do {
            dep = scanner.nextInt();
            if (dep <= 0) {
                System.out.println("Amount must be greater than zero!");
            }
        } while (dep <= 0);

        accountBalances.put(accountID, accountBalances.get(accountID) + dep);
        System.out.println("Deposited " + dep + ". New balance: " + accountBalances.get(accountID));
    }

    // Withdraw method
    public void withdraw() {
        System.out.print("Enter account ID: ");
        int accountID = scanner.nextInt();
        if (!accountBalances.containsKey(accountID)) {
            System.out.println("Account not found!");
            return;
        }

        System.out.print("Enter withdrawal amount (must be > 0): ");
        int wit;
        do {
            wit = scanner.nextInt();
            if (wit <= 0) {
                System.out.println("Amount must be greater than zero!");
            } else if (wit > accountBalances.get(accountID)) {
                System.out.println("Insufficient balance! Current balance: " + accountBalances.get(accountID));
                wit = 0; // Reset withdrawal to keep the loop running
            }
        } while (wit <= 0);

        accountBalances.put(accountID, accountBalances.get(accountID) - wit);
        System.out.println("Withdrawn " + wit + ". New balance: " + accountBalances.get(accountID));
    }

    // Show all account balances
    public void showBalances() {
        if (accountBalances.isEmpty()) {
            System.out.println("No accounts exist.");
            return;
        }

        System.out.println("\nAccount Balances:");
        for (int id : accountBalances.keySet()) {
            System.out.println("Account " + id + ": $" + accountBalances.get(id));
        }
    }
}
