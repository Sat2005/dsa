import java.util.Scanner;

public class bsicsstring {
    public static void main(String[]args){
         System.out.println("enter the string");
         Scanner sc=new Scanner(System.in);
        //  String str=sc.next();//next() takes ip just until it sees space
        //  System.out.println(str);
          
         String str1=sc.nextLine();//takes all strng even ater spaces
         System.out.println(str1); 
         String str2=sc.nextLine();//takes all strng even ater spaces
         System.out.println(str2); 
         int s=str1.length();
         System.out.println(s);
         char c=str1.charAt(5);
         System.out.println(c);
         int d=str1.indexOf('s');
         System.out.println(d);
         int e=str1.compareTo(str2);//if str1==str2 then e=0;if(str1>str2)then positive value returned{lexicaliy grater means character
        //   by character e.g hello and hdello then it will compare character bycharacter here hello is greater 
        // hence will return the difference between asciii values of firstly occured characters
        //  }; and by similar logic if(str1<str2)then negative value is retrned....
   System.out.println(e);
        System.out.println(str1.contains("sat"));
        System.out.println(str1.startsWith("sat"));//prefix is case sensitive
        System.out.println(str1.endsWith("jha"));
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str1.concat(str2));
        System.out.println(str1.substring(1,4));//end index is not included ; it returns string fro start index;
        System.out.println(str1.substring(2));// returns string from start index until last value 

    }
}
 //trings are immutable in java
 //interning in strings is if two or more string has same content both string has same address in order to save space 