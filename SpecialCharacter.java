import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0,count1=0,count2=0;
    for(int i=0;i<s.length();i++){
   char ch=s.charAt(i);
   if(ch>='1'&& ch<='9'){
       count++;
   }
   else if(ch>='a'&& ch<='z'|| ch>='A'&& ch<='Z'){
       count1++;
   }
   else
   count2++;
   
    }
        
  System.out.println(count2);    
    }
}
