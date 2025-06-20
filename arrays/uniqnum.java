import java.util.Scanner;

public class uniqnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the umber of elements in array");
        int n=sc.nextInt();
        System.out.println("enter the values in array ");
        int arr[]=new int [n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=arr[0];
        int k;
        for(j=0;j<n;j++){
            for(k=j+1;k<n;k++){
            if (arr[k]==arr[j]){
               arr[j]=-1;
               arr[k]=-1;
            }
           
            }
        }

        for(i=0;i<n;i++){
            if(arr[i]>0)
            System.out.println("uniqe value is "+arr[i]);
        }
    }
}
