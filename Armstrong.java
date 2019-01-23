import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int val = a;
       int s=0,t=0,u=0;
       while(a>0){
           s=a%10;
           a=a/10;
           u=u+(s*s*s);
       }
       if(u==val)
       System.out.println("yes");
       else
              System.out.println("no");

    }
}
