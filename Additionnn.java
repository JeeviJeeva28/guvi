import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     int  n1=sc.nextInt();
     int b;
      int m1=Math.abs(n);
            int m2=Math.abs(n1);
           b=m1+m2;  
     if(b%2==0){
         System.out.println("even");
     }
     else
     System.out.println("odd");
    }
}
