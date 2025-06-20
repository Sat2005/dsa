import java.util.Scanner;

public class secondlargest {

    public static void main(String[] args) {
        System.out.println("enter the arrays digit number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the eleemnets");
        int arr[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int j;
        int temp = arr[0];

        // Find the largest element
        for (j = 0; j < n; j++) {
            if (arr[j] > temp) {
                temp = arr[j];
            }
        }

        int largest = temp;
        temp = arr[0];

        // Find the second largest element
        for (j = 0; j < n; j++) {
            if (arr[j] < largest && arr[j] > temp) {
                temp = arr[j];
            }
        }

        System.out.println(temp);
    }
}
