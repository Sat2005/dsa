import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a non-negative number to calculate its factorial:");
        int n = sc.nextInt();

        // Ensure the input is valid
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial
            long factorial = 1; // Use long to handle large results
            for (int i = 1; i <= n; i++) {
                factorial *= i;
                System.out.println("The factorial of " + i + " is: " + factorial);
            }
            // Print the result
            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        sc.close(); // Close the Scanner
    }
}
