import java.util.Scanner;

public class prefixsum {
    static void printarr(int arr[]){
        int i=0;
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the arrray values ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the values of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the prefix sum key that has to be known");
        int key=sc.nextInt();

        for(int j=0;j<key;j++){
            if(j==0)
            arr[j]=arr[0];
            else
            arr[j]+=arr[j-1];
        }

        printarr(arr);

    }
}
