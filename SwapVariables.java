
import java.util.Scanner;

public class SwapVariables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swap the numbers
        swapNumbers(num1, num2);

        System.out.println("\nAfter swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        scanner.close();
    }

    // Method to swap two numbers
    public static void swapNumbers(int a, int b) {
        // Temporary variable to hold the value during the swap
        int temp = a;
        a = b;
        b = temp;
    }
}