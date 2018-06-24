package com.loopAssignment2;
/*
 * Exercise 4:
use loops take number lines and display starts
display the output like
 *******
 ******
 *****
 ****
 ***
 **
 *
 */
public class Program4 {
	public static void main(String[] args) {

		int raw =7;
		for(int i=raw;i>=1;i--) {
			for(int j =i;j>=1;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
