import java.util.Scanner;

public class Solution6 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();
        div2(n);
    }

    public static void div2(int n) {
        System.out.println("Numbers divisible by 2 and 3:");
        for (int i = 1; i <= n; i++) { 
            if (i % 2 == 0 && i%3==0) {
                System.out.print(i + " ");
            }
        }
    }
}
