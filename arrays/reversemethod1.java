import java.util.Scanner;

public class reversemethod1 {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        int j = 0;

        // Reverse the array
        for (int i = n - 1; i >= 0; i--) {
            ans[j] = arr[i];
            j++;
        }

        System.out.println("Reversed array:");
        printArray(ans);
    }
}
