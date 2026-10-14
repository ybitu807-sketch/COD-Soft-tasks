import java.util.Scanner;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance = balance - amount;
            System.out.println("Please collect your cash.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }
}

public class ATM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount user = new BankAccount(5000);

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double wAmount = sc.nextDouble();

                    if (wAmount <= 0) {
                        System.out.println("Enter a valid amount.");
                    } else {
                        user.withdraw(wAmount);
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dAmount = sc.nextDouble();

                    if (dAmount <= 0) {
                        System.out.println("Enter a valid amount.");
                    } else {
                        user.deposit(dAmount);
                    }
                    break;

                case 3:
                    user.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}