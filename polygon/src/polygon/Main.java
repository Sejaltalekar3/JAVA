package polygon;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the sides");
	int sides=scan.nextInt();
	identifyPolygon(sides);
}
public static void identifyPolygon(int sides) {
	if(sides>0) {
	switch(sides) {
	case 1:
		System.out.println("point");
		break;
	case 2:
		System.out.println("line");
break;
	case 3:
		System.out.println("traingle");
		break;
	case 4:
		System.out.println("quadrialeral");
		break;
	case 5:
		System.out.println("pentagon");
		break;
	case 6:
		System.out.println("hexagon");
		break;
	case 7:
		System.out.println("heptagon");
		break;
	case 8:
		System.out.println("octagon");
		break;
	case 9:
		System.out.println("nonagon");
		break;
		default:
			System.out.println("polygon");
}
	}
	else {
		System.out.println("your maths skills are very bad or please read the msg propoerly");
	}
}
}