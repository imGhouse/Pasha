import java.util.Scanner;

public class ArmstrongNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Get a number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Process: Check if the number is an Armstrong number
	        boolean isArmstrong = isArmstrongNumber(number);

	        // Output: Print the result
	        if (isArmstrong) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }

	        scanner.close();
	    }

	    // Method to check if a number is an Armstrong number
	    private static boolean isArmstrongNumber(int num) {
	        int originalNumber, remainder, result = 0, n = 0;

	        originalNumber = num;
	        while (originalNumber != 0) {
	            originalNumber /= 10;
	            ++n;
	        }

	        originalNumber = num;
	        while (originalNumber != 0) {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, n);
	            originalNumber /= 10;
	        }

	        return result == num;
	    }
}