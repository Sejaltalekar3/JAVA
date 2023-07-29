package com.kodnest.patternAssignmnet;
/*
 *   A 
    A B 
   A B C 
  A B C D 
 A B C D E 
  A B C D 
   A B C 
    A B 
     A
 * 
 */
public class Program13 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");
		}
		char ch='A';
		for(int j=1;j<=i;j++) {
			System.out.print(ch+" ");
			ch++;
		}
		System.out.println();
	}
	for(int i=1;i<=5;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(" ");
		}
		char ch='A';
	for(int j=4;j>=i;j--) {
		System.out.print(ch+" ");
		ch++;
	}
	System.out.println();
}
}
}
