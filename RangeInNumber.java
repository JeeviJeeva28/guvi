import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=sc.nextInt();
int b=sc.nextInt();
boolean flag=false;

for(int i=a;i<=b;i++){
    if(i==n){
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
    

