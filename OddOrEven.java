public class OddOrEven {
public static void main (String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n>0) {
	      if(n%2==0) {
	        	System.out.println("even");
	      }
	       else{
		      System.out.println("odd");	
	        }
	}
	else {
		System.out.println("invalid");
	   }
   }
}
