import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2;
        n2=n-n1;
        if(n2%2==0){
            System.out.println("even");
        }
        else
        System.out.println("odd");
    }
}
