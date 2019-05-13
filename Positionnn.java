import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
              String s=sc.next();
              String a="";
              String b="";
              for(int i=0;i<s.length();i++){
          if(i%2==0){
              a+=s.charAt(i);
          }
          else
          b+=s.charAt(i);
}
System.out.print(a+" ");
System.out.print(b);
}
}
