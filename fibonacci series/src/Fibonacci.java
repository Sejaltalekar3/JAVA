import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
	int fib1= 0;
	int fib2=1;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number n");
	int n=scan.nextInt();
	if(n==1) {
		System.out.print(fib1);
	}
	else if(n==2) {
		System.out.print(fib1+" "+fib2);
	}
	else {
		System.out.print(fib1+" "+fib2+" ");
		for(int i=3;i<=n;i++)
	{
	 int nextno=fib1+fib2;
	 System.out.print(nextno +" ");
	 fib1=fib2;
	 fib2=nextno;
	
	}
}
}
}