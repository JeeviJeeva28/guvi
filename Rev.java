package guvi;
import java.util.*;
public class Median {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	int rev=0,rem=0;
	while(n>0) {
	rem=n%10;
	rev=(rev*10)+rem;
	n=n/10;
	}
	System.out.println(rev);
}
}
