import java.util.Scanner;

public class pascaltri {
    static void printarr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n) {
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1]; // Create a new row with i+1 elements
            ans[i][0] = 1;           // First element of every row is 1
            ans[i][i] = 1;           // Last element of every row is 1
            for (int j = 1; j < i; j++) { // Fill the inner elements
                ans[i][j] = ans[i - 1][j - 1] + ans[i - 1][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows for Pascal's Triangle:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] result = pascal(n);
        System.out.println("Pascal's Triangle:");
        printarr(result);
    }
}
