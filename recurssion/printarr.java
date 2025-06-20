import java.util.Scanner;

public class printarr {
    // Method to print the array elements starting from the given index
    static void arr1(int arr[], int idx) {
        if (idx == arr.length) {
            return; // Base case: stop if we've reached the end of the array
        }
        System.out.println(arr[idx]); // Print the element at the current index
        arr1(arr, idx + 1); // Recursively call the method for the next index
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Defining an array of integers
        int arr[] = {5, 7, 8, 9, 10};
        
        // Ask the user for an index to start iteration
        System.out.println("Enter the index to start iterating from:");
        int idx = sc.nextInt();
        
        // Validate the index input to ensure it's within the bounds of the array
        if (idx < 0 || idx >= arr.length) {
            System.out.println("Invalid index. Please enter an index between 0 and " + (arr.length - 1));
        } else {
            // Call the arr1 method to print the array elements starting from the given index
            arr1(arr, idx);
        }
        
        sc.close(); // Close the scanner to avoid resource leakage
    }
}
