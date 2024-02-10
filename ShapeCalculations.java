
import java.util.Scanner;

public class ShapeCalculations {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Circle
        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        double circleArea = calculateCircleArea(circleRadius);
        double circlePerimeter = calculateCirclePerimeter(circleRadius);
        displayResults("Circle", circleArea, circlePerimeter);

        // Square
        System.out.print("\nEnter the side length of the square: ");
        double squareSide = scanner.nextDouble();
        double squareArea = calculateSquareArea(squareSide);
        double squarePerimeter = calculateSquarePerimeter(squareSide);
        displayResults("Square", squareArea, squarePerimeter);

        // Rectangle
        System.out.print("\nEnter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        double rectangleArea = calculateRectangleArea(rectangleLength, rectangleWidth);
        double rectanglePerimeter = calculateRectanglePerimeter(rectangleLength, rectangleWidth);
        displayResults("Rectangle", rectangleArea, rectanglePerimeter);

        // Parallelogram
        System.out.print("\nEnter the base of the parallelogram: ");
        double parallelogramBase = scanner.nextDouble();
        System.out.print("Enter the height of the parallelogram: ");
        double parallelogramHeight = scanner.nextDouble();
        double parallelogramArea = calculateParallelogramArea(parallelogramBase, parallelogramHeight);
        double parallelogramPerimeter = calculateParallelogramPerimeter(parallelogramBase);
        displayResults("Parallelogram", parallelogramArea, parallelogramPerimeter);

        scanner.close();
    }

    // Circle calculations
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    // Square calculations
    public static double calculateSquareArea(double side) {
        return Math.pow(side, 2);
    }

    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    // Rectangle calculations
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Parallelogram calculations
    public static double calculateParallelogramArea(double base, double height) {
        return base * height;
    }

    public static double calculateParallelogramPerimeter(double base) {
        // Assuming sides opposite to the base are equal in a parallelogram
        return 2 * (base + base);
    }

    // Display results for a shape
    public static void displayResults(String shape, double area, double perimeter) {
        System.out.println("\n" + shape + " Area: " + area);
        System.out.println(shape + " Perimeter: " + perimeter);
    }
}