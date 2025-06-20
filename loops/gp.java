import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        System.out.println("ente the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          
        int a=3,r=4;
        for( int i=1;i<=n;i++){
           
        System.out.println(a+" ");
        a*=r;
        }
    }
}
