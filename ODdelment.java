import java.util.*;
public class MyClass {
    public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  String s="";
  String at="";
  int a;
 while(n>0){
     a=n%10;
     if(a%2!=0){
         s+=a;
     }
     n=n/10;
 }
     for(int i=s.length()-1;i>=0;i--){
        at+=s.charAt(i);
     }
  System.out.println(at);
     }
    }

