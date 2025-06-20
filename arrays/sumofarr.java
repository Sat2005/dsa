import java.util.*;

public class sumofarr {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i=0;int sum=0;
        System.out.println("enter the "+n+ "values of array");
        while(i<n){
           a[i]=sc.nextInt();
        //    sum=a[i];
           sum+=a[i];
           i=i+1;
        }

        System.out.println("the value of sum of array is " +sum); 
    }
}
