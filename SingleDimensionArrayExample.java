
public class SingleDimensionArrayExample {

	public static void main(String[] args) {
        // Declare and initialize a single-dimensional array
        int[] myArray = {21, 19, 32, 29, 51};

        // Display the elements of the array
        System.out.println("Elements of the array:");

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }
    }
}