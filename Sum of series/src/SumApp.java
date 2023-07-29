import java.util.Scanner;
public class SumApp {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();
        sum(n);
    }  
 public static void sum(int n)
{
    double sum=0;
	for(double i=1;i<=n;i++)
    {
    	sum=sum+1/i;
    }
	System.out.println(sum);
}
}
