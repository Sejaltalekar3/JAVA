import java.util.Scanner;
public class solution2 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();
        div2(n);
    }

    public static void div2(int n) {
        System.out.println("Numbers divisible by 3:");
        for (int i = 1; i <= n; i++) { 
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
