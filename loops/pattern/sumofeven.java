

import java.util.*;

public class sumofeven {
    
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        while(a!=0){
               int lastd=a%10;
               if(lastd%2==0)
               sum+=lastd;
               a/=10;
        }

        System.out.println(sum);


        
    }
}
