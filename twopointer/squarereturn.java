import java.util.Scanner;

public class squarereturn {
    static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        
        System.out.println("Enter the values into the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
          
        int left=0;int right=n-1,k=0;
        int[]ans=new int[n];

        while (left<=right) {

            //greater number square is added
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;

            }
            else{
               ans[k++]=arr[right]*arr[right];
               right--;
            }
            
        }
        int anr[]=new int[n];
            //  int i=0; 
             int j=0;
             for (int i = n - 1; i >= 0; i--) {
                anr[j] = ans[i];
                j++;
            }
    
        

        printarr(anr);

    }
}
