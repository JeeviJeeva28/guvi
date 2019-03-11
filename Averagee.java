import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int average=0;
 int num=0;
 for(int i=0;i<=n;i++){
    num=num+i;
     average=num/n;
 }
 System.out.println(average);
        }
    }
