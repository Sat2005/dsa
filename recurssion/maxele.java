import java.util.*;

public class maxele {
    static int max(int arr[],int idx){
        if(idx==arr.length-1) return arr[idx];
        int smallAns=max(arr, idx+1);
        return Math.max(smallAns, arr[idx]);
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,8};
        System.out.println("ente the index from where you have to iterate");
        Scanner sc=new Scanner(System.in);
        int idx=sc.nextInt();
        System.out.println(max(arr, idx)); 
    }
}
