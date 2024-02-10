
import java.util.Scanner;

class Mobile {
    private double balance;

    // Constructor to initialize the mobile with zero balance
    public Mobile() {
        this.balance = 0.0;
    }

    // Method to get the current balance of the mobile
    public double getBalance() {
        return balance;
    }

    // Method to recharge and increase the balance
    public void recharge(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Recharge successful. Current balance: $" + balance);
        } else {
            System.out.println("Invalid recharge amount. Amount must be greater than 0.");
        }
    }

    // Method to make a call and decrease the balance
    public void makeCall(double callCost) {
        if (callCost > 0) {
            if (callCost <= balance) {
                balance -= callCost;
                System.out.println("Call successful. Remaining balance: $" + balance);
            } else {
                System.out.println("Insufficient balance. Please recharge to make a call.");
            }
        } else {
            System.out.println("Invalid call cost. Cost must be greater than 0.");
        }
    }
    public static void main(String[] args) {
        // Creating an instance of the Mobile class
        Mobile myMobile = new Mobile();
        Scanner scanner = new Scanner(System.in);

        // Mobile control loop
        while (true) {
            System.out.println("\nCurrent Balance: $" + myMobile.getBalance());
            System.out.print("Enter 'R' to recharge, 'C' to make a call, or 'Q' to quit: ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'R':
                case 'r':
                    System.out.print("Enter recharge amount: $");
                    double rechargeAmount = scanner.nextDouble();
                    myMobile.recharge(rechargeAmount);
                    break;
                case 'C':
                case 'c':
                    System.out.print("Enter call cost: $");
                    double callCost = scanner.nextDouble();
                    myMobile.makeCall(callCost);
                    break;
                case 'Q':
                case 'q':
                    System.out.println("Exiting mobile control.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}