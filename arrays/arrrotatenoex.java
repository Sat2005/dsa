import java.util.Scanner;

public class arrrotatenoex {

    // Helper function to reverse a part of the array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value to rotate:");
        int k = sc.nextInt();

        // Normalize k
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining n-k elements
        reverse(arr, k, n - 1);

        System.out.println("Rotated array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
