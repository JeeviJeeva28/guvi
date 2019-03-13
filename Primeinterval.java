import java.util.*;
public class MyClass {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int e=sc.nextInt();
for(int i=s;i<=e;i++){
    int count=0;
    for(int k=2;k<i;k++){
        if(i%k==0){
            count++;
            break;
        }
    }
    if(count==0){
        System.out.print(i+" ");
    }
}
    }
}
