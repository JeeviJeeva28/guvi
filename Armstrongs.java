import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int s=0,t=0,u=0;
       for(int i=a;i<=b;i++){
           int num=i;
       while(num>0){
           s=num%10;
           num=num/10;
           u=u+(s*s*s);
       }
       
       if(u==i)
       System.out.println(i+"");
       
u=0;
}
    }
}
