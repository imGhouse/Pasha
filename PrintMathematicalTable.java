
public class PrintMathematicalTable {

	public static void main(String[] args) {
        int multiplier = 5; // You can change this to get the table of a different number

        // Print the multiplication table
        System.out.println("Multiplication Table of " + multiplier + ":");

        for (int i = 1; i <= 10; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + result);
        }
    }
}