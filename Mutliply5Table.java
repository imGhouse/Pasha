

public class Mutliply5Table {

	public static void main(String[] args) {
	        int numberOfTables = 5;

	        for (int i = 1; i <= numberOfTables; i++) {
	            System.out.println("Multiplication Table for " + i + ":");
	            for (int j = 1; j <= 10; j++) {
	                System.out.println(i + " * " + j + " = " + (i * j));
	            }
	            System.out.println(); // Add a blank line between tables for better readability
	        }
	    }
	}