import java.util.Scanner;

public class muultiple {

    // Recursive function to print multiples
    public static void printMultiples(int number, int limit) {
        // Base case: Stop when limit becomes 0
        if (limit == 0) {
            return;
        }

        // Print the current multiple
        System.out.println(number + " x " + limit + " = " + (number * limit));

        // Recursive call with decremented limit
        printMultiples(number, limit - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number and limit
        System.out.println("Enter the number:");
        int number = sc.nextInt();

        System.out.println("Enter the limit:");
        int limit = sc.nextInt();

        // Print multiples using recursion
        System.out.println("Multiples of " + number + ":");
        printMultiples(number, limit);
    }
}
