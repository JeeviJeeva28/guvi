import java.util.regex.*;
import java.util.*;
public class Vowels {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String saa = s.replaceAll("[AaEeIiOoUu]", "");
 System.out.println(saa);
	}

}
