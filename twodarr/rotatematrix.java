import java.util.Scanner;

public class rotatematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.println("Enter the values of matrix rows and columns:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        // Input matrix elements
        int arr[][] = new int[row][col];
        System.out.println("Enter the values in the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 1: Transpose the matrix
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) { // Start from i+1 to avoid re-swapping
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < row; i++) {
            int start = 0;
            int end = col - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

        // Output the rotated matrix
        System.out.println("Rotated array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
