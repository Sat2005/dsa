import java.util.Scanner;

public class arrrotate {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i, j;

        System.out.println("enter the values of array");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the value to rotate");
        int k = sc.nextInt();

        // Normalize k to avoid unnecessary rotations
        k = k % n;

        int temp[] = new int[n];
        for (j = 0; j < n; j++) {
            temp[(j + k) % n] = arr[j];
        }

        for (j = 0; j < n; j++) {  // Corrected loop condition
            arr[j] = temp[j];
        }

        System.out.println("Rotated array:");
        for (j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
    }
}
