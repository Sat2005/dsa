import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        System.out.println("ente the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          
        int hf=1;
        for( int i=n-1;i>=1;i--){
           if(n%i==0)
           {
            hf=i;
            break;
           }
        // System.out.println(i);

        
        }
        System.out.println(hf);
    }
}
