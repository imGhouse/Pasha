
public class FindDuplicates {

	public static void main(String[] args) {
    
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 9, 10, 2, 5, 6, 1, 7, 8};

        System.out.println("Duplicate numbers in the array:");

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[j]);
                }
            }
        }
    }
}