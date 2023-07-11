import java.util.Scanner;
 class Powersq {

public static int squareNumber(int num){

return num*num;

}

}
public class ThePowerofSquares {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter a Number");

		int num=scan.nextInt();

		System.out.println(Powersq .squareNumber(num));
}
}