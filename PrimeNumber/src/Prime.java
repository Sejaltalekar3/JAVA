import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the n");
		int n=scan.nextInt();
	 for(int i=2;i<n;i++) {
		if( n%i==0)
			{
				System.out.println("  not a prime number");
				return;
			}
	 }
				System.out.println("prime number");
			}
		}




