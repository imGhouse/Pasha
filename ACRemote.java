
import java.util.Scanner;

class ACRemote {
    private int temperature;
    private String mode;

    // Constructor to initialize the AC remote
    public ACRemote() {
        this.temperature = 25; // Initial temperature set to 25 degrees Celsius
        this.mode = "Cool";    // Initial mode set to Cool
    }

    // Method to increase the temperature
    public void increaseTemperature() {
        if (temperature < 30) {
            temperature++;
            System.out.println("Temperature increased to " + temperature + " degrees Celsius.");
        } else {
            System.out.println("Cannot increase temperature further.");
        }
    }

    // Method to decrease the temperature
    public void decreaseTemperature() {
        if (temperature > 16) {
            temperature--;
            System.out.println("Temperature decreased to " + temperature + " degrees Celsius.");
        } else {
            System.out.println("Cannot decrease temperature further.");
        }
    }

    // Method to change the mode
    public void changeMode(String newMode) {
        if (newMode.equalsIgnoreCase("Cool") || newMode.equalsIgnoreCase("Heat") || newMode.equalsIgnoreCase("Fan")) {
            mode = newMode;
            System.out.println("Mode changed to " + mode + ".");
        } else {
            System.out.println("Invalid mode. Available modes: Cool, Heat, Fan.");
        }
    }

    // Method to display the current settings
    public void displaySettings() {
        System.out.println("Current Settings - Temperature: " + temperature + " degrees Celsius, Mode: " + mode);
    }
        // Creating an instance of the ACRemote class
        ACRemote myACRemote = new ACRemote();
        	Scanner scanner = new Scanner("System.in,");,
        // AC control loop
        while (true) {
            System.out.print("Enter 'I' to increase temperature, 'D' to decrease temperature, " +
                    "'M' to change mode, or 'Q' to quit: ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'I':
                case 'i':
                    myACRemote.increaseTemperature();
                    break;
                case 'D':
                case 'd':
                    myACRemote.decreaseTemperature();
                    break;
                case 'M':
                case 'm':
                    System.out.print("Enter mode (Cool, Heat, Fan): ");
                    String newMode = scanner.next();
                    myACRemote.changeMode(newMode);
                    break;
                case 'Q':
                case 'q':
                    System.out.println("Exiting AC remote control.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            myACRemote.displaySettings();
        }
    }
}