package array;

public class Array2D {
    private int[][] matrix;

    // Constructor
    public Array2D(int[][] matrix) {
        this.matrix = matrix;
    }

    // Display the matrix
    public void printMatrix() {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // Addition
    public Array2D add(Array2D other) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != other.matrix.length || cols != other.matrix[0].length) {
            throw new IllegalArgumentException("Matrix dimensions must match for addition.");
        }

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] + other.matrix[i][j];
            }
        }

        return new Array2D(result);
    }

    // Subtraction
    public Array2D subtract(Array2D other) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != other.matrix.length || cols != other.matrix[0].length) {
            throw new IllegalArgumentException("Matrix dimensions must match for subtraction.");
        }

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] - other.matrix[i][j];
            }
        }

        return new Array2D(result);
    }

    // Multiplication
    public Array2D multiply(Array2D other) {
        int rows1 = matrix.length;
        int cols1 = matrix[0].length;
        int rows2 = other.matrix.length;
        int cols2 = other.matrix[0].length;

        if (cols1 != rows2) {
            throw new IllegalArgumentException("Matrix dimensions not suitable for multiplication.");
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix[i][k] * other.matrix[k][j];
                }
            }
        }

        return new Array2D(result);
    }

    // Main method to demonstrate all operations
    public static void main(String[] args) {
        int[][] matA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matB = {
            {7, 8, 9},
            {10, 11, 12}
        };

        int[][] matC = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        Array2D A = new Array2D(matA);
        Array2D B = new Array2D(matB);
        Array2D C = new Array2D(matC);

        System.out.println("Matrix A:");
        A.printMatrix();

        System.out.println("Matrix B:");
        B.printMatrix();

        System.out.println("Addition (A + B):");
        Array2D sum = A.add(B);
        sum.printMatrix();

        System.out.println("Subtraction (A - B):");
        Array2D diff = A.subtract(B);
        diff.printMatrix();

        System.out.println("Multiplication (A x C):");
        Array2D prod = A.multiply(C);
        prod.printMatrix();
    }
}

