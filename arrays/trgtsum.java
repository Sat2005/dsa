import java.util.Scanner;

public class trgtsum {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr the no.of values of arrays");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=arr[0];
        System.out.println("enter the ey");
        int key=sc.nextInt();
        int k;
        for(j=0;j<n;j++){
            for(k=j+1;k<n;k++){
        if(arr[j]+arr[k]==key)
        {
            System.out.println(arr[j]+" "+arr[k]);
        }}
        }


    }
}
