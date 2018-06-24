package com.loopAssignment2;

import java.util.Scanner;

/* Exercise 1:
create a while loop to display sum of integers, if you enter 0; program should exit
output e.g: 
Enter an integer
3
sum = 3
Enter an integer
4
sum = 7
Enter an integer
4
sum = 11
Enter an integer
-3
sum = 8
0
sum =8
 */
public class Sum {

	public static void main(String[] args) {
		//create a sacnner for user input 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num1 = input.nextInt();
		int sum=0;
		//it will alllow to sum till user not enter 0
		while (num1 !=0) {
			sum =sum +num1;
			System.out.println("Sum="+sum);
			Scanner input1 = new Scanner(System.in);   
			System.out.println("Enter an integer:");	//again ask the user for input 
			num1 = input1.nextInt();
		
		}
	}
}
