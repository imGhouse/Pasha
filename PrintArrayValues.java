
public class PrintArrayValues {

	public static void main(String[] args) {
        // Declare and initialize an array
        int[] myArray = {11, 22, 33, 44, 55};

        // Print the values of the array
        System.out.println("Array values:");

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }
    }
}