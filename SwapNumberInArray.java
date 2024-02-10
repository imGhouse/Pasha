
public class SwapNumberInArray{
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {5, 10, 15, 20, 25};

        // Indexes of the numbers to be swapped
        int index1 = 1; // Index of the first number
        int index2 = 3; // Index of the second number

        // Validate indexes
        if (index1 < 0 || index1 >= numbers.length || index2 < 0 || index2 >= numbers.length) {
            System.out.println("Invalid indexes. Please ensure indexes are within the array bounds.");
        } else {
            // Swap the numbers at the given indexes
            int temp = numbers[index1];
            numbers[index1] = numbers[index2];
            numbers[index2] = temp;

            // Print the array after swapping
            System.out.println("Array after swapping:");
            for (int number : numbers) {
                System.out.println(number);
            }
        }
    }
}