import java.util.*;

public class presentarr {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i=0;int sum=0;
        System.out.println("enter the "+n+ "values of array");
        while(i<n){
           a[i]=sc.nextInt();
          i++;
        }
        int key;
        System.out.println("enter the key to search");
        key=sc.nextInt();
        int t=a[0];

        for(i=0;i<n;i++){
            if(a[i]==key)
          t=i;
            else
          t=-1;
        }
System.out.println(t);
    }
}
