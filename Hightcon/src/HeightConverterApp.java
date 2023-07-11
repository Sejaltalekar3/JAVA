import java.util.Scanner;
public class HeightConverterApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the height in inches:");
	 double heightInInches = scan.nextDouble();

     HeightConverter converter = new HeightConverter();
     double heightInFeet = converter.convertInchesToFeet(heightInInches);

     System.out.printf("%.2f%n", heightInFeet);
}
}
