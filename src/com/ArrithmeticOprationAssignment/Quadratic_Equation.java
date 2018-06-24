package com.ArrithmeticOprationAssignment;

import java.util.Scanner;

/*
 * Exercise 2:
Find result for the following quadratic equation
a quadratic equation is 3*X^2 - 8*X + 4
give different values to X and run the program and display the result
Input: integer value for x
Output: result after substituting the x value.
e.g: 
input: 1
output: -1 
explanation: 3*1*1 - 8*1 + 4 = -1
 */
public class Quadratic_Equation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of x:");
		double x = input.nextDouble();

		 double temp1 = 3*x*x - 8*x + 4;

	        System.out.println("Output: "+temp1);
		
	}

}
