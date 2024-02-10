
public class ArraySum {

	public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {11, 22, 33, 44, 55};

        // Calculate the sum of array elements
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Print the result
        System.out.println("Sum of array elements: " + sum);
    }
}