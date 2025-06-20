import java.util.Scanner;

public class oddnotri {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter hte number ofrows and columns");
        int i=sc.nextInt();
        int j=sc.nextInt();
         int n,p;
        for(n=1;n<=i;n++){
            int a=1;
            for(p=1;p<=n;p++){
                System.out.print(a);
                a+=2;
            }
            p++;
System.out.println();
        }

    }
}
