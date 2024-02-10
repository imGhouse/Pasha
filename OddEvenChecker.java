import java.util.Scanner;

public class OddEvenChecker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Get a number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Process: Check if the number is odd or even
	        String result = checkOddEven(number);

	        // Output: Print the result
	        System.out.println(number + " is " + result + ".");

	        scanner.close();
	    }

	    // Method to check if a number is odd or even
	    private static String checkOddEven(int num) {
	        // Using the modulo operator to check if the number is even or odd
	        return (num % 2 == 0) ? "even" : "odd";
	    }
}