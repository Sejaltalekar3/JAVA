package com.kodnest.patternAssignmnet;
/*
 
 
 
**     **
* *   * *
*  * *  *
*   *   *
*       *
*       *
*       *
*       *
 
 */
public class Program21 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 1 || (i == j && i <= 9/2+ 1) || (i + j == 10 && i <= 9 / 2 + 1)||j==9) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

