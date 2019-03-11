package javaproject;
import java.util.*;
public class Count {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  int a[]=new int[10];
	      int max=a[0];
	      for(int i=0;i<a.length;i++){
	          a[i]=sc.nextInt();
	      }
	      for(int i=1;i<a.length;i++){
	          if(a[i]>max){
	              max=a[i];
	          }
	      }
	      System.out.println(max);

	}

}
