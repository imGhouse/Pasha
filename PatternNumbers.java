
public class PatternNumbers {
	    public static void main(String[] args) {
	        int rows = 5; // You can change this value to adjust the number of rows

	        // Loop to iterate through rows
	        for (int i = 1; i <= rows; i++) {
	            // Loop to iterate through columns for each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            // Move to the next line after each row
	            System.out.println();
	        }
	    }
	}