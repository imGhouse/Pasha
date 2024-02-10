
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Get the number of terms from the user
	        System.out.print("Enter the number of terms for the Fibonacci series: ");
	        int numTerms = scanner.nextInt();

	        // Process: Print the Fibonacci series
	        System.out.println("Fibonacci series up to " + numTerms + " terms:");

	        for (int i = 0; i < numTerms; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }

	        scanner.close();
	    }

	    // Method to calculate the nth Fibonacci number
	    private static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return fibonacci(n - 1) + fibonacci(n - 2);
	        }
	    }
	}