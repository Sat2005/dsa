import java.util.*;

public class bonus {

    // Function to find the smallest and largest elements in the array
    static int[] findSmallestAndLargest(int arr[]) {
        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Return an array with the smallest and largest elements
        return new int[] {smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function to find smallest and largest elements
        int[] result = findSmallestAndLargest(arr);
        System.out.println("Smallest Element: " + result[0]);
        System.out.println("Largest Element: " + result[1]);
    }
}
