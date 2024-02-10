import java.util.Scanner;

public class NumberMultiplierChecker {
	
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Get a number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Process: Check if the number is multiplied by 5
	        boolean isMultipliedBy5 = checkIfMultipliedBy5(number);

	        // Output: Print the result
	        if (isMultipliedBy5) {
	            System.out.println(number + " is multiplied by 5.");
	        } else {
	            System.out.println(number + " is not multiplied by 5.");
	        }

	        scanner.close();
	    }

	    // Method to check if a number is multiplied by 5
	    private static boolean checkIfMultipliedBy5(int num) {
	        // Using the modulo operator to check if the number is a multiple of 5
	        return num % 5 == 0;
	    }
	}