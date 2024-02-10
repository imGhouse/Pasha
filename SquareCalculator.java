import java.util.Scanner;

public class SquareCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Get a number from the user
	        System.out.print("Enter a number: ");
	        double number = scanner.nextDouble();

	        // Process: Calculate the square
	        double square = calculateSquare(number);

	        // Output: Print the result
	        System.out.println("Square of " + number + " is: " + square);

	        scanner.close();
	    }

	    // Method to calculate the square of a number
	    private static double calculateSquare(double num) {
	        return num * num;
	    }
	}