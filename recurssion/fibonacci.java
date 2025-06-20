import java.util.Scanner;

public class fibonacci {

    static int fib(int n){ 
        if(n==0||n==1)
        return n;

        int s=fib(n-1);
        int y=fib(n-2);

        return s+y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for fibonacci");
        int n=sc.nextInt();
        System.out.println(fib(n));   
    }
}
