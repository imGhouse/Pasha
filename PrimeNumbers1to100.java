
public class PrimeNumbers1to100 {
	    public static void main(String[] args) {
	        System.out.println("Prime numbers between 1 and 100:");

	        for (int i = 2; i <= 100; i++) {
	            if (isPrimeNumber(i)) {
	                System.out.print(i + " ");
	            }
	        }
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

