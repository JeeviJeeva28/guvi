import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int aa=sc.nextInt();
        int x=sc.nextInt();
        int a[]=new int [aa];
        for(int i=0;i<aa;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<x;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
