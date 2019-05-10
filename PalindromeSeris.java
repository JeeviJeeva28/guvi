import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String a="";
String s=sc.next();
for(int i=s.length()-1;i>=0;i--){
    a+=s.charAt(i);
  
}
if(s==a){
    System.out.println("YES");
}
else
System.out.println("No");
          }
      }
    

