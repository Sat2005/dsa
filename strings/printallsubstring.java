import java.util.Scanner;

public class printallsubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("All substrings of the given string are:");

        // Nested loops to generate all substrings
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) { // Ensure j > i
                System.out.println(str.substring(i, j)); // Extract and print substring
            }
        }
            
        sc.close();
    }
}
