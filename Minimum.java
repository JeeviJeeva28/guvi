import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int a[]=new int[n];
      int max=0;
      for(int i=0;i<a.length;i++){
                    a[i]=sc.nextInt();

      }
      for(int i=0;i<a.length;i++){
          for(int j=i+1;j<a.length;j++){
              if(a[i]>a[j]){
                  max=a[i];
                  a[i]=a[j];
                  a[j]=max;
              }
          }
      }
      
          System.out.println(a[0]);

    }
}
