import java.util.*;

// package pattern;

public class alpharect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of rows and columns");
       int i=sc.nextInt();
       int j=sc.nextInt();
          
       for (int n=1;n<=i;n++){
        for (int p=1;p<=j;p++)
        System.out.print((char)(p+64));
        System.out.println();
       }
    //    System.out.println();
    }
}