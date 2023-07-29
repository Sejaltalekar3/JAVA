import java.util.Scanner;
public class SumOfDigit {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the n");
	int n=scan.nextInt();
	int sum=0;
	while(n!=0) {
		 int rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	System.out.println(sum);
}
}
