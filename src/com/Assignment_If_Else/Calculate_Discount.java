package com.Assignment_If_Else;

import java.util.Scanner;

/*
 * Write a program which calculate the Discount(5%) price for a collection of items, where the
 *  discount applies to purchases of total over $10.00. cost details:
    5 cents per a cookie
    3 cents per a cake
Note: take no.of cookies and no.of cakes from user and find 5% discount
Hit: use if statement and multiplication operation
 */
public class Calculate_Discount {

	public float getdisplay() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter cookies : ");
		int cookies = input.nextInt();

		System.out.println("Enter cake: ");
		int cake = input.nextInt();

		int priceOfCookies =5*cookies;
		int priceOfCake = 3*cake;

		float total = priceOfCake+priceOfCookies;
		
		if(total>10) {
			float discounttotal = (total*5/100);
			
		return total = total-discounttotal;
	}else {
		System.out.println("Discount may not apply under 10");
		return total;
		}
	}
	public static float getdisplay1(int cake,int cookies) {
		
		int priceOfCookies =5*cookies;
		int priceOfCake = 3*cake;

		float total = priceOfCake+priceOfCookies;
		
		if(total>10) {
			float discounttotal = (total*5/100);
			
		return total = total-discounttotal;
	}else {
		System.out.println("Discount may not apply under 10");
		return total;
		}
	}

	public static void main(String[] args) {
		Calculate_Discount discount = new Calculate_Discount();
	System.out.println(discount.getdisplay());
	
	System.out.println(getdisplay1(3, 2));

	}
}
