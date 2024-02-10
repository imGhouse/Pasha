

public class MutliplicationTables {
    public static void main(String[] args) {
        // Outer loop for tables from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Table for " + i + ":");
            
            // Inner loop for multiplying and printing values
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }
            
            // Add a new line for better readability
            System.out.println();
        }
    }
}