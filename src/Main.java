import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = null; // Initialize account as null
        boolean running = true;

        while (running) {
            System.out.println("Simple Banking System");
            System.out.println("1. Create a bank account");
            System.out.println("2. Check the balance");
            System.out.println("3. Deposit money");
            System.out.println("4. Withdraw money");
            System.out.println("5. Exit the system");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Create account details
                    System.out.print("Enter account holder's name: ");
                    scanner.nextLine(); // Consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    account = new Account(name, accountNumber);
                    System.out.println("Bank account created for " + name + " with account number " + accountNumber + ".");
                    break;
                case 2:
                    if (account != null) {
                        System.out.println("Balance: " + account.getBalance());
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 3:
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 4:
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
