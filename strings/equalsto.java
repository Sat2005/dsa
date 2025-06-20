public class equalsto {
    public static void main(String[] args) {
        
    
    String str1="sataym";
    String str2="sataym";
    String str3=new String("sataym");

    if(str1==str2){
        System.out.println(true);
    }
    if(str1==str3)//returns false because == operator scan the address if they ar same then they are eqal
    {
        System.out.println(true);
    }

    if(str1.equals(str3))
    System.out.println("true");//returns true because equalsto() checks the address as well as characters also hence always use equalsto(  )

}}
