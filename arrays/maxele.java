import java.util.*;

public class maxele {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array no. of data");
        int a=sc.nextInt();
        int ar[];
        ar=new int[a];
        int i=0;
        while (i<a){
        ar[i]=sc.nextInt();
        i=i+1;
        }
      int temp=ar[0];
      int j=0;
        while(j<a-1){
            if(ar[j]<ar[j+1])
            temp=ar[j+1];
            // else
            // temp=ar[i];
            j=j+1;
        }
        
        System.out.println(temp);
    }
}
