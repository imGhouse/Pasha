
public class MultiplyFirst10NaturalNumbers {
    public static void main(String[] args) {
        // Calculate the multiplication of the first 10 natural numbers
        long product = 1; // Using 'long' to handle larger results

        for (int i = 1; i <= 10; i++) {
            product *= i;
        }

        // Print the result
        System.out.println("Multiplication of the first 10 natural numbers: " + product);
   }
}