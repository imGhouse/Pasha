import java.util.Scanner;

public class BinaryFormat {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Get a decimal number from the user
	        System.out.print("Enter a decimal number: ");
	        int decimalNumber = scanner.nextInt();

	        // Process: Convert the decimal number to binary
	        String binaryFormat = convertToBinary(decimalNumber);

	        // Output: Print the binary format
	        System.out.println("Binary format of " + decimalNumber + " is: " + binaryFormat);

	        scanner.close();
	    }

	    // Method to convert a decimal number to binary
	    private static String convertToBinary(int decimalNumber) {
	        StringBuilder binary = new StringBuilder();

	        while (decimalNumber > 0) {
	            int remainder = decimalNumber % 2;
	            binary.insert(0, remainder); // Insert at the beginning of the string
	            decimalNumber /= 2;
	        }

	        return binary.toString();
	    }
	}