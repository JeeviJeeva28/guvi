import java.util.*;
public class MyClass {
    public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  int count=0;
  int n=sc.nextInt();
  for(int i=n;i>=1;i--){
      if(n%i==0){
          count++;
      }
  }
     if(count!=2){
         System.out.println("composite");
     }
     else
     System.out.println("prime");
      
  
    }
}
