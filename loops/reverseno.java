import java.util.Scanner;

public class reverseno {
     public static void main(String[] args) {
        System.out.println("ente the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=10;i>=n;i--)
        System.out.println(i);

    }
}
