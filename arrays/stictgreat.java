import java.util.Scanner;

public class stictgreat {
    public static void main(String[]args){
        System.out.println("enter the arrays digit number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the eleemnets");
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++){
              arr[i]=sc.nextInt();

        }
        System.out.println("enter the value you have to know occurrence");
        int key=sc.nextInt();
        int j=0,count=0,occ=arr[0];
        for(j=0;j<n;j++){
             if(arr[j]>key){
                  count++;
                  occ=j;
             }
        }
        System.out.println(count);
        System.out.println(occ);

    }
}
