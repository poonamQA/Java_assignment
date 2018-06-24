package com.loopAssignment;

import java.util.Scanner;

/*
 * Exercise 3:
Us government ask our team to develop an application for traditional weighing machine. can you please develop an application.
Hint : create a loop statement in which it should ask left side and right side weights, whenever both sides are equal then it should come out of loop.

Output e.g 1:
Enter left side weight
20
Enter right side weight
20
both are same weights

Output e.g 2:
Enter left side weight
32
Enter right side weight
20
both are not same weights

Enter left side weight
16
Enter right side weight
32
both are not same weights

Enter left side weight
36
Enter right side weight
32
both are same weights//because 32+16+36 == 20+32+32
 */
public class Exercise3 {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter left side weight: ");
		int left = input.nextInt();

		System.out.println("Enter right side weight: ");
		int right = input.nextInt();

		if(left == right) {
			System.out.println("both are same weight");
		}else {
			System.out.println("both are not same");
		}
	}

}
