// package pattern;

import java.util.Scanner;

public class alphanumtri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter hte number ofrows and columns");
        int i=sc.nextInt();
        int j=sc.nextInt();
         int n,p;
        for(n=1;n<=i;n++){
            for(p=1;p<=n;p++){
              if(n%2!=0) 
               System.out.print(p);
                else 
                System.out.print((char)(p+64));
              
            }
            p++;
            System.out.println();
            // System.out.println((char)(p+64));
// System.out.println();
        }

    }
}
