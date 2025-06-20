// package pattern;

import java.util.Scanner;

public class alhtri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter hte number ofrows and columns");
        int i=sc.nextInt();
        int j=sc.nextInt();
         int n,p;
        for(n=1;n<=i;n++){
            for(p=1;p<=n;p++){
                System.out.print((char)(p+64));
            }
            p++;
System.out.println();
        }

    }
}
