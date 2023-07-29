package com.kodnest.patternAssignmnet;
/*
 *   1
 *   121
 *   12321
 *   1234321
 *   12345321
 *   12345654321
 *   1234567654321
 *   
 * 
 * 
 */
public class Program4 {
public static void main(String[] args) {
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		for(int j=i-1;j>=1;j--) {
			System.out.print(j);
		}
		System.out.println();
	}

}
}
