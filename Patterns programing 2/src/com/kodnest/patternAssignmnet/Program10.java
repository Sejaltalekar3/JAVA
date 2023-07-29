package com.kodnest.patternAssignmnet;
public class Program10 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		char ch='A';
		for(int j=5;j>=i;j--) {
			System.out.print(ch);
			ch++;
		}
		for(int j=1;j<=i;j++) {
			System.out.print(" "+" ");
		}
		char a = (char) (ch-1);
		for(int j=5;j>=i;j--) {
			
			System.out.print(a--);
		}

		System.out.println();
	}
	for(int i=1;i<=5;i++) {
		 char ch2='A';
		for(int j=1;j<=i;j++) {
			System.out.print(ch2);
			ch2++;
		}
		for(int j=5;j>=i;j--) {
			System.out.print(" "+" ");
		}
			 char ch3='A';
			 char b = (char) (ch3+i- 1);
			for(int j=1;j<=i;j++) {
				System.out.print(b);
				b--;
			}
		System.out.println();}
}
}