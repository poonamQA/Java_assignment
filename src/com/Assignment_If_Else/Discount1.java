package com.Assignment_If_Else;

import java.util.Scanner;

/*
 * Program 2:
Write a program which calculate the Discount(5%) price for an Item, where the discount applies 
to purchases over $10.00.
Note: take the item price from user and find 5% discount
Hit: use if statement
 */
public class Discount1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price: ");
		double price = sc.nextDouble();

		if(price >=10) {
			double discount =(( price * 5)/100)-price;

			System.out.println("Discount is :  "+discount);
		}else {
			System.out.println("Discount may not apply under 10$");
		}
	}

}
