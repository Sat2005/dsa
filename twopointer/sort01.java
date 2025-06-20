import java.util.*;

public class sort01 {

    static void printarr(int arr[]) {
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array values");
        int n = sc.nextInt();
        System.out.println("enter the values into the array");
        int i;
        int arr[] = new int[n];

        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0, right = n - 1, temp;
        // Changed the loop condition to avoid out-of-bounds error
        for (i = 0; left < right; ) {
            if (arr[left] > arr[right]) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            } else if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            }
        }

        printarr(arr);
    }
}
