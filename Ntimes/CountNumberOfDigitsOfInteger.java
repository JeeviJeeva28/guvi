public class CountNumberOfDigitsOfInteger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
for(int i=0;n>0;count++) {
  n/=10;
    }	   
	System.out.println(count);
}
}
