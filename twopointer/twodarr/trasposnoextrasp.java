import java.util.Scanner;

public class trasposnoextrasp {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the vales of matrices rows and columns ");
        int row=sc.nextInt();
        int col=sc.nextInt();
   int arr[][]=new int[row][col];
        System.out.println("enter the values in array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               arr[i][j]=sc.nextInt();
            }
        }
        // no extra array to store 
        System.out.println("transpoed matrix with no extra space");
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;}}

                for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        System.out.print(arr[i][j]+" ");
                    }System.out.println();
                }

}}
