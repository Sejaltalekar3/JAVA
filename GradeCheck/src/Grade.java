import java.util.Scanner;

public class Grade {
	public static void grades(int n)
	{
		if(n>50) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enetr n");
		int n=scan.nextInt();
		grades(n);
	}
	}
