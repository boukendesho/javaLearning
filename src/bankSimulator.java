import java.util.Scanner;

public class bankSimulator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // main menu
        // show balance
        // deposit
        // withdraw
        // exit

        int choice;
        boolean isRunning = true;
        double balance = 0;

        System.out.println("Welcome to bank system.");
        System.out.println("1. Show balance.");
        System.out.println("2. Deposit.");
        System.out.println("3. Withdraw.");
        System.out.println("4. Exit");

        while (isRunning) {
            System.out.print("Select a option (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid option.");
            }
        }

        scanner.close();
        System.out.println("Thank you for use our system.");

    }

    static void showBalance(double balance) {
        System.out.printf("Your balance: $%,.2f\n", balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter your deposit amount: ");
        amount = scanner.nextDouble();

        if (amount > 0) {
            return amount;
        } else {
            System.out.println("Amount can't be negative or zero.");
            return 0;
        }
    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter your withdraw amount: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative or zero.");
            return 0;
        } else {
            return amount;
        }
    }
}
