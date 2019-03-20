package javavaa;
import java.util.*;
public class Num {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];

for(int i=0;i<a.length;i++){
    a[i]=sc.nextInt();
 }
int min=a[0];
int max=a[0];
 for(int i=0;i<a.length;i++){
   if(a[i]>max){
   
       max=a[i];
   }  
 }
 for(int j=1;j<a.length;j++){
	   if(a[j]<min){
		   min=a[j];
	   }  
	 }
 System.out.println(min+" "+max);
 
	}
}
