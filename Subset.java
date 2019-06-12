import java.util.*;
public class Subset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int n1=sc.nextInt();
   int count=0;
    int a[]=new int [n];
    int a1[]=new int [n1];
    for(int i=0;i<n;i++){
    	a[i]=sc.nextInt();
    		
    }
	//System.out.println("next");
    for(int i=0;i<n1;i++){
    	a1[i]=sc.nextInt();
    		
    }
    for(int i=0;i<n;i++){
    	for(int j=0;j<n1;j++){
    	if(a[i]==a1[j]){
    		count++;
    	}
    }
	}
    if(count==n1)
    	System.out.println("yes");
    else
    	System.out.println("no");
	}
}
