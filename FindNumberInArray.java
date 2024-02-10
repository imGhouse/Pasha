
import java.util.Scanner;
public class FindNumberInArray {
    public static void main(String[] args) {
        // Declare and initialize an array with two values
        int[] myArray = {10, 20};

        // Get the number to search from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to find: ");
        int numberToFind = scanner.nextInt();

        // Search for the number in the array
        int index = -1; // Initialize index to -1 (not found)

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == numberToFind) {
                index = i; // Update index if the number is found
                break;     // Exit the loop once the number is found
            }
        }

        // Print the result
        if (index != -1) {
            System.out.println("Number " + numberToFind + " found at index " + index);
        } else {
            System.out.println("Number " + numberToFind + " not found in the array");
        }
    }
}