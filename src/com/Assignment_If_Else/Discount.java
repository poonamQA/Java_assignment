package com.Assignment_If_Else;

import java.util.Scanner;

/*
 * Program 1:
Write a program which calculate the Discount(5%) price for an Item.
Note: take the item price from user and find 5% discount
Hint: Use Scanner class and nextDouble() method
 */
public class Discount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price: ");
		double price = sc.nextDouble();
		
		
		double discount =(( price * 5)/100)-price;
		
		System.out.println("Discount is :  "+discount);
		
		
	}

}
