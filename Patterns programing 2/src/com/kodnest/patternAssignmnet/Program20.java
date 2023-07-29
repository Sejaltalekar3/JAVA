package com.kodnest.patternAssignmnet;
/*
 * *        **
**      * *
* *    *  *
*  *  *   *
***********
***********
*  *  *   *
* *    *  *
**      * *
*        **
*         *
  
 */
public class Program20 {
	public static void main(String[] args) {
for(int i=1;i<=11;i++) {
	for(int j=1;j<=11;j++) {
		if(i==j||j==1||j==11||i+j==11||i==5||i==6) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
		System.out.println();
	
}
	}
}
