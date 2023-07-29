package com.kodnest.patternAssignmnet;
/*
 * A
 * BC
 * DEF
 * GHIJ
 * KLMNO
 * PQRSTU
 *
 */
public class Program24 {
public static void main(String[] args) {
	char ch = 'A';
	for (int i = 1; i <= 6; i++) {
        
        for (int j = 1; j <= i; j++) {
            System.out.print(ch++);
        }
        System.out.println();
    }
}
}
