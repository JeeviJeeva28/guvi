import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=1;
    for(int i=0;i<s.length();i++){
    if(s.charAt(i)=='.' && s.charAt(i+1)!=' '){
        count++;
    }
    }
        
  System.out.println(count);    
    }
}
