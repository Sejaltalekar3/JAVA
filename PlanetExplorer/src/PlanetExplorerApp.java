
import java.util.Scanner;
	public class PlanetExplorerApp {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the radius of the sphere: ");
	        double radius = scanner.nextDouble();

	        PlanetExplorer explorer = new PlanetExplorer();
	      System.out.printf("%.2f",explorer.calculateSurfaceArea(radius));
	        scanner.close();
	    }
	}

