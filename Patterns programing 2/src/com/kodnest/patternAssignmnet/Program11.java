package com.kodnest.patternAssignmnet;


/*
 * 1        1
 * 12      21
 * 123    321
 * 1234  4321
 * 1234554321
 * 
 * 
 */
public class Program11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); }
            for (int k = 1; k <= 2 * (5 - i); k++) {
                System.out.print(" ");     }
            for (int j = i; j >= 1; j--) {
                System.out.print(j); 
            }
            System.out.println();
        }
    }
}