import java.util.Scanner;

public class lcm {

    // Function to calculate GCD (Greatest Common Divisor)
    static int gcd(int a, int b) {
        if (b == 0) 
            return a;
        return gcd(b, a % b);
    }

    // Function to calculate LCM (Least Common Multiple)
    static int lcm(int a, int b) {
        // Using the formula: LCM(a, b) = |a * b| / GCD(a, b)
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Two numbers
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        // Output: LCM
        System.out.println("The LCM of " + a + " and " + b + " is: " + lcm(a, b));
    }
}
