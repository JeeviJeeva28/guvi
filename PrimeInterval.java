import java.util.Scanner;
public class JavaProgram
{
    public static void main(String args[])
    {
        int a, b, count=0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        for(int i=a; i<=b; i++)
        {
            count = 0;
            for(int j=2; j<i; j++)
            {
                if(i%2 == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
