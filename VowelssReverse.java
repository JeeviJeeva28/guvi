import java.util.regex.*;
import java.util.*;
public class Vowels {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
String s=sc.next();
char[] ch=s.toCharArray();
//char[] ch1=new chatAt;
for(int i=0;i<n;i++){
	//System.out.print(ch[i]);
	
}

String saa = s.replaceAll("[AaEeIiOoUu]", "");
 StringBuilder sb=new StringBuilder(saa);
 sb.reverse();
 System.out.println(sb);
	}

}

