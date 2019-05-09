import java.util.*;
public class MyClass {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
 String s="";
 String a=sc.next();
 for(int i=a.length()-1;i>=0;i--){
     s+=a.charAt(i);
 }
 if(s.equals(a)){
     System.out.println("palindrome");
 }
 else
 System.out.println("noy");
 
    }
}
