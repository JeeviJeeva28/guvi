import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
for(int i=n;i>=1;i--){
    if(n%i==0){
        count++;
        
    }
}
if(count==2){
    System.out.println("yes");
}
else
System.out.println("no");
    }
}
