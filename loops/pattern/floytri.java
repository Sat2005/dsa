import java.util.Scanner;

public class floytri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter hte number ofrows and columns");
        int i=sc.nextInt();
        int j=sc.nextInt();
         int n,p;
         int a=1;
        for(n=1;n<=i;n++){
              
            for(p=1;p<=n;p++){
                // int a=1;
                // int rs=a;
                System.out.print(a++);
                
            }
            p++;
System.out.println();
        }

    }
}
