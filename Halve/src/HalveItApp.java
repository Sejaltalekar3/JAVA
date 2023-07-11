import java.util.Scanner;
public class HalveItApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scan.nextDouble();
System.out.printf("%.2f",HalveIt.halveTheNumber(number));
   
    }
}

