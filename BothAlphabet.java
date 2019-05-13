import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=65 && s.charAt(i)<=90)&& (s.charAt(i)>=97&& s.charAt(i)<=122)){
                count++;
            }
            else if(s.charAt(i)>=48&&s.charAt(i)<=57)
            {
                count++;
            }
            
        }
        if(count>=2)
         System.out.println("yes");
         else
            System.out.println("no");
    }
}
