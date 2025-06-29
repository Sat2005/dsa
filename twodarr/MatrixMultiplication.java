import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for the first matrix
        System.out.println("Enter rows and columns for the first matrix:");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();

        // Input dimensions for the second matrix
        System.out.println("Enter rows and columns for the second matrix:");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();

        // Check if matrices can be multiplied
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible. Columns of first matrix must match rows of second matrix.");
            return;
        }

        // Input first matrix
        int[][] mat1 = new int[rows1][cols1];
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        int[][] mat2 = new int[rows2][cols2];
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        // Perform matrix multiplication
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        // Display the result matrix
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
