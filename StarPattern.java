import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
String s=sc.next();
if(s.length()%2==0){
    int mid=s.length()/2;
  String len=s.substring(mid-1,mid+1);
  len="**";
  System.out.println(s.substring(0,mid-1)+len+s.substring(mid+1));
}
else{
int mid=s.length()/2;
String len=s.substring(mid,mid+1);
len="*";
System.out.println(s.substring(0,mid)+len+s.substring(mid+1));
          }
      }
}
    
