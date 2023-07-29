import java.util.Scanner;
public class MultipleOfTen {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the numbers");
	int n=scan.nextInt();
	int o=scan.nextInt();
	checkMultiple(n,o);
}	
public static void checkMultiple(int n,int o) {
	if(n%o==0) {
		System.out.println("the number is multiple of "+o);
		
	}
	else {
		System.out.println("the number is not a multiple of "+o);
	}
}
}