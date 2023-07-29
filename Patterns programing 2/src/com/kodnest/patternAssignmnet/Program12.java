package com.kodnest.patternAssignmnet;
/*
 *  11111111
 *  11111122
 *  11113333
 *  11144444
 *  11555555
 *  16666666
 *  77777777
 */
public class Program12 {
public static void main(String[] args) {
	for(int i=1;i<=7;i++) {
		for(int j=7;j>=i;j--) {
			System.out.print("1");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
}
}
