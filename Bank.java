import java.util.Scanner;

class BankAccount {
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: Rs. " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.println("Enter amount to deposit:");
        double dep = sc.nextDouble();
        account.deposit(dep);

        account.checkBalance();

        System.out.println("\nEnter amount to withdraw:");
        double with = sc.nextDouble();
        account.withdraw(with);

        account.checkBalance();

        sc.close();
    }
}