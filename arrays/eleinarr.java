import java.util.Scanner;

public class eleinarr {

    static int[] frqency(int[]arr)
    {
             int[] freq= new int[10005];
             for (int i = 0; i<arr.length; i++) {
                // arr[i] = sc.nextInt();
                freq[arr[i]]=freq[arr[i]]+1;
            }
        
            return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
   int[]freq=frqency(arr);
        System.out.println("enter the number of queries");
        int q=sc.nextInt();

        while(q>0){
           System.out.println("enter the number to be searched");
           int x=sc.nextInt();
           if(freq[x]>0){
            System.out.println("yes");
           }
           else{
            System.out.println("no");
           }
           
            q--;
        }
    }
}
