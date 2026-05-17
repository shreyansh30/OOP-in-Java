import java.util.Scanner;
import jdk.jshell.spi.SPIResolutionException;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (balance - amount < 1000) {
            throw new InsufficientBalanceException("Insufficient balance in account " + accountNumber);
        }
        balance -= amount;
        System.out.println("Withdrawal of Rs." + amount + " successful. New balance: Rs." + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of Rs." + amount + " successful. New balance: Rs." + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class bank {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter account number: ");
            String accountNumber = scanner.next();

            System.out.print("Enter initial balance: ");
            double balance = scanner.nextDouble();

            BankAccount account = new BankAccount(accountNumber, balance);

            while (true) {
                System.out.println("\n1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    }
                    case 2 -> {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        try {
                            account.withdraw(withdrawAmount);
                        } catch (InsufficientBalanceException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    case 3 -> System.out.println("Current balance: Rs." + account.getBalance());
                    case 4 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                    
                }
                
            }
        }
    }
}