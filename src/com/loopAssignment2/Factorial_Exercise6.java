package com.loopAssignment2;
/*
 * Exercise 6:
create a write a program to display factorial of a number
Hint : read a number(n) and use this formula for factorial 1*2*3*....n
5! = 5*4*3*2*1 = 120  
 */
public class Factorial_Exercise6 {

	public static void getFctorial(int num) {
		int result =1;
		for(int i=1;i<=num;i++) {
			 result = result*i;
			System.out.println(result);
			
		}System.out.println(num +" Factorial is : "+result);
		
	}
	public static void main(String[] args) {
		getFctorial(5);
		
	}

}
