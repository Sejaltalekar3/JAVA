package com.kodnest.patternAssignmnet;
public class Program23 {
public static void main(String[] args) {
	for (int i = 1; i <= 6; i++) {
		char ch='A';
        char ch1 = (char) (ch+i- 1);
        for (int j = 1; j <= i; j++) {
            System.out.print(ch1);
            ch1--;
        }
        System.out.println();
    }
}
}