import java.util.Scanner;

public class matrixadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.println("Enter the number of rows and columns for Matrix A:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println("Enter the number of rows and columns for Matrix B:");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        // Check dimension compatibility before input
        if (row != row1 || col != col1) {
            System.out.println("Error: Matrices must have the same dimensions for addition.");
            return;
        }

        // Input matrices
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] ans = new int[row][col];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Perform addition
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[i][j] = a[i][j] + b[i][j];
            }
        }

        // Print result
        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
