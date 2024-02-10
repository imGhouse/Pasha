
public class SumofFirst10 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        // Calculating the sum of the first 10 natural numbers
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of the first " + n + " natural numbers: " + sum);
    }
}