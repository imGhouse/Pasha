import java.util.Scanner;

public class GoldCalculator {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Get the weight of gold in grams
	        System.out.print("Enter the weight of gold in grams: ");
	        double goldWeight = scanner.nextDouble();

	        // Input: Get the number of stones
	        System.out.print("Enter the number of stones: ");
	        int numberOfStones = scanner.nextInt();

	        // Constants: Rates and making charges
	        double goldRatePerGram = 5250;
	        double stoneRatePerStone = 1500;
	        double makingChargesPercentage = 18;

	        // Process: Calculate the total price
	        double goldPrice = calculateGoldPrice(goldWeight, goldRatePerGram);
	        double stonePrice = calculateStonePrice(numberOfStones, stoneRatePerStone);
	        double makingCharges = calculateMakingCharges(goldPrice, makingChargesPercentage);

	        double totalPrice = goldPrice + stonePrice + makingCharges;

	        // Output: Print the total price
	        System.out.println("\nTotal Price Calculation:");
	        System.out.println("Gold Price: Rs " + goldPrice);
	        System.out.println("Stone Price: Rs " + stonePrice);
	        System.out.println("Making Charges: Rs " + makingCharges);
	        System.out.println("Total Price: Rs " + totalPrice);

	        scanner.close();
	    }

	    // Method to calculate the price of gold
	    private static double calculateGoldPrice(double weight, double ratePerGram) {
	        return weight * ratePerGram;
	    }

	    // Method to calculate the price of stones
	    private static double calculateStonePrice(int numberOfStones, double ratePerStone) {
	        return numberOfStones * ratePerStone;
	    }

	    // Method to calculate making charges based on a percentage of gold price
	    private static double calculateMakingCharges(double goldPrice, double percentage) {
	        return (percentage / 100) * goldPrice;
	    }
	}