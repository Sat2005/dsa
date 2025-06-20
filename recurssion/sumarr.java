import java.util.Scanner;

public class sumarr {

    static int sum(int arr[],int idx){
        if(idx==arr.length){
           return 0;
        }
         int s=0;
    s=sum(arr, idx+1);
    return s+arr[idx];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,4,5,6};
        System.out.println("enter the index");
        int idx=sc.nextInt();
        System.out.println(sum(arr, idx));
    }
}
