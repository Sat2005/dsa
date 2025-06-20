import java.util.*;
public class addition {
static int add(int n){
    if(n>=0&&n<=9) return n;
     return add(n/10)+n%10;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
       System.out.println(add(n));
    }
}
