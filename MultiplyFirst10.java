
public class MultiplyFirst10 {
    public static void main(String[] args) {
        int n = 10;
        long multiplication = 1; // Use long to handle larger results

        // Calculating the multiplication of the first 10 natural numbers
        for (int i = 1; i <= n; i++) {
            multiplication *= i;
        }

        System.out.println("Multiplication of the first " + n + " natural numbers: " + multiplication);
    }
}