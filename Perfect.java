import java.util.*;
public class MyClass {
    public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
    int n1=sc.nextInt();
    boolean flag=false;
    for(int i=0;i<=100;i++){
        if(n*n1==i*i){
        flag=true;
        break;
        }
    }
    if(flag)
    System.out.println("yes");
  else
  System.out.println("no");
    }
    }
