import java.util.*;
public class MyClass {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0;
if(a==0 || a==1){
    System.out.println("no");
}
for(int i=2;i<a;i++){
    if(a%i==0){
        count++;
       break;
    }
}
if(count==0)
System.out.println("yes");
else
System.out.println("no");
    }
}
