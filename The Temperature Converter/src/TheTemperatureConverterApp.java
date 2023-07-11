	import java.util.Scanner;
public class TheTemperatureConverterApp {



	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);

	System.out.println("Enter temp in F");

	double f=scan.nextDouble();

	TheTemperatureConverter temperatureConverter=new TheTemperatureConverter();

	System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(f));
}

}
