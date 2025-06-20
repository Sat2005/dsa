import java.util.Scanner;

public class starcross {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nmbre of rows and columns");
        int a=sc.nextInt();
        int b=sc.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if(i==j ||(i+j==b+1))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
