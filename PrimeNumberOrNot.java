
import java.util.Scanner;
public class PrimeNumberOrNot {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Get a number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Process: Check if the number is a prime number
	        boolean isPrime = isPrimeNumber(number);

	        // Output: Print the result
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	        scanner.close();
	    }

	    // Method to check if a number is a prime number
	    private static boolean isPrimeNumber(int num) {
	        if (num <= 1) {
	            return false; // Numbers less than or equal to 1 are not prime
	        }

	        // Check for factors up to the square root of the number
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false; // If a factor is found, the number is not prime
	            }
	        }

	        return true; // If no factors are found, the number is prime
	    }
	}