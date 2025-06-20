import java.util.Scanner;

public class gcd {

    static int gcd1(int a, int b) {
        // Base case: When b is 0, GCD is a
        if (b == 0) 
            return a;
        // Recursive case: Call gcd1 with b and a % b
        return gcd1(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("Enter the two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd1(a, b));
    }
}
