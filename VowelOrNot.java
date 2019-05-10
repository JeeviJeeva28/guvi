import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
String s=sc.next();
String a="";
boolean flag=false;
for(int i=0;i<s.length();i++){
    a+=s.charAt(i);
    if(a.charAt(i)=='a'||a.charAt(i)=='e'||s.charAt(i)=='i'|| a.charAt(i)=='o'||a.charAt(i)=='u'){
        flag=true;
        break;
    }
}
if(flag)
  System.out.println("yes");
    else
    System.out.println("no");
          }
      }
    

