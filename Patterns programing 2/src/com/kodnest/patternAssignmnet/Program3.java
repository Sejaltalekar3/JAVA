package com.kodnest.patternAssignmnet;
/*
 *   7
 *   76
 *   765
 *   7654
 *   76543
 *   765432
 *   7654321
 * 
 */
public class Program3 {
public static void main(String[] args) {
	for(int i=7;i>=1;i--) {
		for(int j=7;j>=i;j--) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
