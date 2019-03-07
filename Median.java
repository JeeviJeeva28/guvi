package guvi;
import java.util.*;
public class Median {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int median=0;
		 int n=sc.nextInt();
		int a[]=new int[n];
	       for(int i=0;i<n;i++){
	          a[i]=sc.nextInt();
	       }
	       for(int i=0;i<n;i++){
	       sum=sum+a[i];
           median=sum/n;
	      
	}
	       System.out.println(median);
	}
}
