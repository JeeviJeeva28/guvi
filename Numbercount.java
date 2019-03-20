package javavaa;
import java.util.*;
public class Num {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int count = 0; 
int num=sc.nextInt();

while(num != 0)
{
    num /= 10;
    count++;
}
System.out.println("Number of digits: " + count);
	}
}
