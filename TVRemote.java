
import java.util.Scanner;

class TVRemote {
    private boolean isOn;
    private int volume;

    // Constructor to initialize the TV remote
    public TVRemote() {
        this.isOn = false;
        this.volume = 50; // Initial volume set to 50
    }

    // Method to turn on the TV
    public void turnOn() {
        isOn = true;
        System.out.println("TV is now on.");
    }

    // Method to turn off the TV
    public void turnOff() {
        isOn = false;
        System.out.println("TV is now off.");
    }

    // Method to increase the volume
    public void increaseVolume() {
        if (isOn) {
            volume += 5;
            System.out.println("Volume increased to " + volume);
        } else {
            System.out.println("Cannot increase volume. TV is off.");
        }
    }

    // Method to decrease the volume
    public void decreaseVolume() {
        if (isOn) {
            volume -= 5;
            System.out.println("Volume decreased to " + volume);
        } else {
            System.out.println("Cannot decrease volume. TV is off.");
        }
    }

    // Method to check if the TV is on
    public boolean isTVOn() {
        return isOn;
    }

    public static void main(String[] args) {
        // Creating an instance of the TVRemote class
        TVRemote myTVRemote = new TVRemote();
        Scanner scanner = new Scanner(System.in);

        // Using the TV remote functionalities
        myTVRemote.turnOn();
        
        // Volume control loop
        while (myTVRemote.isTVOn()) {
            System.out.print("Enter 'I' to increase volume, 'D' to decrease volume, or 'O' to turn off: ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'I':
                case 'i':
                    myTVRemote.increaseVolume();
                    break;
                case 'D':
                case 'd':
                    myTVRemote.decreaseVolume();
                    break;
                case 'O':
                case 'o':
                    myTVRemote.turnOff();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}