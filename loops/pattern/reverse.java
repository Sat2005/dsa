import java.util.*;

// package pattern;

public class reverse {
    public static void main(String[]args){
       System.out.println("enter the number"); 
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int lastd=0;
       int s=0;
       while(n!=0){
         lastd=n%10;
        System.out.print(lastd);
         s+=lastd;
        n/=10;
       }
       System.out.println(s);
    }
}
