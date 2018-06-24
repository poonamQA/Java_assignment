package com.ArrithmeticOprationAssignment;

import java.util.Scanner;

/*
 * Exercise 3:
Find roots for the following quadratic equation.
The quadratic equation is a*X^2 + b*X + c
give different values to a,b and c. Find roots by using formula. (-b +/- sqrt(b^2 - 4*a*c) / 2*a)
If roots are imaginary then display no roots.
 */
public class Find_Root {

	public void display() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of a:");
		double a = input.nextDouble();
		System.out.println("Enter value of b:");
		double b = input.nextDouble();
		System.out.println("Enter value of c:");
		double c = input.nextDouble();

		double root1 = b*b-4*a*c;
		if(root1==0) { 
			System.out.println("it has root1");
		}else if(root1>0) {
			System.out.println("It has root2");
		}else {
			System.out.println("It has no root");     

		}

	}
	public static void main(String[] args) {
		//for root1 take vale a= 4, b =12 and c = -9
		Find_Root f = new Find_Root();
		f.display();
		//for root0 take vale a= 12, b = 12 and c = 12
		Find_Root f1 = new Find_Root();
		f1.display();
		//for root1 take vale a= 4, b =12 and c = -9
		Find_Root f2 = new Find_Root();
		f2.display();
		
				
	}
}
