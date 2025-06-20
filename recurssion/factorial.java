import java.util.*;

class factorial {
    int n;
    static int factoria(int n){
        // int n;
            if(n==0){
                // System.out.println("answer is 1");
                return 1;
            }
         return n * factoria(n-1);
        // System.out.println("answer is "+ans);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nnumber of which you need factorial");
        int n=sc.nextInt();  

        System.out.println(factoria(n));

    }
    // factoria(n)
}
