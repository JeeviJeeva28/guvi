public class AlphabetOrNot {
public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	char ch=sc.next().charAt(0);
	if(ch>=65&& ch<=90 || ch>=97 &&ch<=122) {
	System.out.println("alphabet");
	}
	else if(ch>=48 && ch<=57){
		System.out.println("number");
	}
	else {
		System.out.println("invalid");
	}
}
}
