import java.util.Scanner;
public class FinanceCalculatorApp {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		 System.out.print("Enter the principal amount: ");
	        double principal = scan.nextDouble();
	        System.out.print("Enter the rate of interest (in decimal): ");
	        double rate = scan.nextDouble();
	        System.out.print("Enter the time in years: ");
	        double time = scan.nextDouble();
	        FinanceCalculator calculator = new FinanceCalculator();
	        System.out.printf("%.2f",calculator.calculateSimpleInterest(principal, rate, time));
	    
	        
	}

}
