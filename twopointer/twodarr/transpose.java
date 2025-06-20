import java.util.Scanner;

public class transpose {
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
        int ans[][]=new int[row][col];
        System.out.println("transposed array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            //    arr[i][j]=sc.nextInt();
            if(i==j)
            ans[i][j]=arr[i][j];

            else{
                ans[i][j]=arr[j][i];
            }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
