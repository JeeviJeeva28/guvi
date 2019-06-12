import java.util.*;;
public class Sorting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner  sc=new Scanner(System.in);
     int n=sc.nextInt();
    int a[]=new int [n];
    int count=0;
    for(int i=0;i<a.length;i++){
    	a[i]=sc.nextInt();    	
	}
	for(int i=0;i<a.length;i++){
	if(i==a[i]){
		System.out.print(a[i]+" ");	
		count++;
	}
	}
	if(count==0)
		System.out.println("-1");
}
}
