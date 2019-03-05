import java.util.*;
public class hello {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
     int max=0;
     int a[]=new int[n];
for(int i=0;i<a.length;i++){
 a[i]=sc.nextInt();
 }
 for(int i=0;i<a.length;i++){
     if(a[i]>max){
         max=a[i];
         
     }
 }
 System.out.println(max);
 }
}
