
import java.util.Scanner;
class WaterBottle {
    private double capacity;
    private double currentLevel;

    // Constructor to initialize the water bottle with a specified capacity
    public WaterBottle(double capacity) {
        this.capacity = capacity;
        this.currentLevel = 0.0; // Initial water level set to 0
    }

    // Method to get the current water level in the bottle
    public double getCurrentLevel() {
        return currentLevel;
    }

    // Method to fill the water bottle up to a specified amount
    public void fill(double amount) {
        if (amount > 0) {
            double newLevel = currentLevel + amount;
            if (newLevel <= capacity) {
                currentLevel = newLevel;
                System.out.println("Bottle filled. Current water level: " + currentLevel + " liters");
            } else {
                System.out.println("Cannot fill beyond the bottle's capacity. Try a smaller amount.");
            }
        } else {
            System.out.println("Invalid fill amount. Amount must be greater than 0.");
        }
    }

    // Method to sip water from the bottle, reducing the water level
    public void sip(double amount) {
        if (amount > 0) {
            if (amount <= currentLevel) {
                currentLevel -= amount;
                System.out.println("Sipped. Current water level: " + currentLevel + " liters");
            } else {
                System.out.println("Cannot sip more than the current water level. Try a smaller amount.");
            }
        } else {
            System.out.println("Invalid sip amount. Amount must be greater than 0.");
        }
    }

    // Method to empty the water bottle completely
    public void empty() {
        currentLevel = 0.0;
        System.out.println("Bottle emptied. Current water level: " + currentLevel + " liters");
    }
    public static void main(String[] args) {
        // Creating an instance of the WaterBottle class with a capacity of 1 liter
        WaterBottle myBottle = new WaterBottle(1.0);
        Scanner scanner = new Scanner(System.in);

        // Water bottle control loop
        while (true) {
            System.out.println("\nCurrent Water Level: " + myBottle.getCurrentLevel() + " liters");
            System.out.print("Enter 'F' to fill, 'S' to sip, 'E' to empty, or 'Q' to quit: ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'F':
                case 'f':
                    System.out.print("Enter fill amount (liters): ");
                    double fillAmount = scanner.nextDouble();
                    myBottle.fill(fillAmount);
                    break;
                case 'S':
                case 's':
                    System.out.print("Enter sip amount (liters): ");
                    double sipAmount = scanner.nextDouble();
                    myBottle.sip(sipAmount);
                    break;
                case 'E':
                case 'e':
                    myBottle.empty();
                    break;
                case 'Q':
                case 'q':
                    System.out.println("Exiting water bottle control.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}