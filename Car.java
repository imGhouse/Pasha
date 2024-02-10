
import java.util.Scanner;

class Car {
    private int speed;

    // Constructor to initialize the car with zero speed
    public Car() {
        this.speed = 0;
    }

    // Method to get the current speed of the car
    public int getSpeed() {
        return speed;
    }

    // Method to accelerate and increase the speed
    public void accelerate(int acceleration) {
        if (acceleration > 0) {
            speed += acceleration;
            System.out.println("Car is accelerating. Current speed: " + speed + " km/h");
        } else {
            System.out.println("Invalid acceleration value. Acceleration must be greater than 0.");
        }
    }

    // Method to apply brakes and decrease the speed
    public void applyBrakes(int brakeForce) {
        if (brakeForce > 0) {
            if (brakeForce < speed) {
                speed -= brakeForce;
                System.out.println("Brakes applied. Current speed: " + speed + " km/h");
            } else {
                speed = 0;
                System.out.println("Car stopped. Brakes fully applied.");
            }
        } else {
            System.out.println("Invalid brake force value. Brake force must be greater than 0.");
        }
    }

        // Creating an instance of the Car class
        Car myCar = new Car();
        Scanner scanner = new Scanner(System.in);

        // Car control loop
        while (true) {
            System.out.println("\nCurrent Speed: " + myCar.getSpeed() + " km/h");
            System.out.print("Enter 'A' to accelerate, 'B' to apply brakes, or 'Q' to quit: ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'A':
                case 'a':
                    System.out.print("Enter acceleration value: ");
                    int acceleration = scanner.nextInt();
                    myCar.accelerate(acceleration);
                    break;
                case 'B':
                case 'b':
                    System.out.print("Enter brake force value: ");
                    int brakeForce = scanner.nextInt();
                    myCar.applyBrakes(brakeForce);
                    break;
                case 'Q':
                case 'q':
                    System.out.println("Exiting car control.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}