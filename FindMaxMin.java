
public class FindMaxMin {

	public static void main(String[] args) {

		int[] numbers = {5, 3, 8, 2, 7, 1, 9, 4, 6, 0};

        
		int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}