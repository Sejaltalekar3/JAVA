package com.kodnest.patternAssignmnet;
/*
 * 			1 2 3 4 5 6 7
 *   		 2 3 4 5 6 7
 *            3 4 5 6 7
 *             4 5 6 7
 *             5 6  7
 *              6 7
 *               7
 *             6 7
 *             5 6 7
 *            4 5 6 7
 *           3 4 5 6 7
 *          2 3 4 5 6 7
 *         1 2 3 4 5 6 7
 * 
 * 
 * 
 * 
 * 
 */
public class Program6 {
public static void main(String[] args) {
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int j=7;j>=i;j--) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	for(int i=1;i<=7;i++) {
		for(int j=7;j>=i;j--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
}
}
