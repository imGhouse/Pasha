import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Matrix A: ");
        int rowsA = scanner.nextInt();

        System.out.print("Enter the number of columns for Matrix A: ");
        int colsA = scanner.nextInt();

        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter elements for Matrix A:");

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the number of rows for Matrix B: ");
        int rowsB = scanner.nextInt();

        System.out.print("Enter the number of columns for Matrix B: ");
        int colsB = scanner.nextInt();

        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter elements for Matrix B:");

        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Check if matrix addition and multiplication are possible
        if (colsA != rowsB) {
            System.out.println("Matrix addition and multiplication are not possible.");
        } else {
            int[][] resultAddition = addMatrices(matrixA, matrixB);
            int[][] resultMultiplication = multiplyMatrices(matrixA, matrixB);

            System.out.println("Matrix A:");
            printMatrix(matrixA);

            System.out.println("Matrix B:");
            printMatrix(matrixB);

            System.out.println("Matrix Addition (A + B):");
            printMatrix(resultAddition);

            System.out.println("Matrix Multiplication (A * B):");
            printMatrix(resultMultiplication);
        }

        scanner.close();
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}