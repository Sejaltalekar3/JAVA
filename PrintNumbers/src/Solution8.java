import java.util.Scanner;

public class Solution8 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();
        div2(n);
    }

    public static void div2(int n) {
        System.out.println("Numbers divisible by 5 and are odd:");
        for (int i = 1; i <= n; i++) { 
            if (i % 2 != 0 && i%5==0) {
                System.out.print(i + " ");
            }
        }
    }
}