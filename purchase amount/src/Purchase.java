import java.util.Scanner;
public class Purchase {
	public static void checkDiscount(double n)
{
	if(n>100) {
		System.out.println("Discount is available");
	}
	else {
		System.out.println("discount not applicable");
	}
}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enetr n");
	double n=scan.nextDouble();
	checkDiscount(n);
}
}
