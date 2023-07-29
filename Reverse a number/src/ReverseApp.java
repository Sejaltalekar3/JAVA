import java.util.Scanner;
public class ReverseApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number to reverse");
	int n=scan.nextInt();
	Reverse r=new Reverse();
	int rev=r.reverse(n);
	System.out.println("the reverse numbers is "+rev);
	if(n==rev) {
		System.out.println("the given numbre is palindrome");
	}
	else {
		System.out.println("the number is not a palindrome");
	}
}
}
