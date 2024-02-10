
public class SumOfFirst10NaturalNumbers {
    public static void main(String[] args) {
        // Calculate the sum of the first 10 natural numbers
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        // Print the result
        System.out.println("Sum of the first 10 natural numbers: " + sum);
    }
}