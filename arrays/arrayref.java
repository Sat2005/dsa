import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayref {

    public static void main(String[] args) {
        // Declare and initialize an array
        int[] arr = new int[5];
        int[] arr2 = Arrays.copyOf(arr, arr.length); // Reference copy
        
        // Assign values to the array
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // Print both arrays
        System.out.println("Array 1:");
        printArray(arr);
        
        System.out.println("Array 2 (Reference of Array 1):");
        printArray(arr2);

        // Modify the first array
        arr[0] = 99;

        // Print arrays after modification
        System.out.println("\nAfter modifying Array 1:");
        System.out.println("Array 1:");
        printArray(arr);
        
        System.out.println("Array 2 (Reference of Array 1):");
        printArray(arr2);
    }

    // Method to print an array
    static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
