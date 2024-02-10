import java.util.Scanner;

public class Palindrome {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Get a number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Process: Check if the number is a palindrome
	        boolean isPalindrome = isPalindromeNumber(number);

	        // Output: Print the result
	        if (isPalindrome) {
	            System.out.println(number + " is a palindrome number.");
	        } else {
	            System.out.println(number + " is not a palindrome number.");
	        }

	        scanner.close();
	    }

	    // Method to check if a number is a palindrome
	    private static boolean isPalindromeNumber(int num) {
	        int originalNumber = num;
	        int reversedNumber = 0;

	        while (num != 0) {
	            int digit = num % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            num /= 10;
	        }

	        return originalNumber == reversedNumber;
	    }
	}
