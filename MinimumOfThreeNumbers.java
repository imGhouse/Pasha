import java.util.Scanner;

public class MinimumOfThreeNumbers {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Get three numbers from the user
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        System.out.print("Enter the third number: ");
	        int num3 = scanner.nextInt();

	        // Process: Find the minimum of the three numbers
	        int minimum = findMinimum(num1, num2, num3);

	        // Output: Print the result
	        System.out.println("Minimum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + minimum);

	        scanner.close();
	    }

	    // Method to find the minimum of three numbers
	    private static int findMinimum(int a, int b, int c) {
	        return Math.min(Math.min(a, b), c);
	    }
	}
