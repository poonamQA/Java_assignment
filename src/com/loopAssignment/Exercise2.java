package com.loopAssignment;
/*
 * Exercise 2:
read two values a,b and repeat a loop from a to b and display value and their sqaure values.
output e.g: 
enter a and b value
3
5

3 9
4 16
5 25
 */
public class Exercise2 {

 static void getSquare(int a,int b) {
		for(int i=a;i<=b;i++) {

			int square = i*i;
			System.out.println(square);
		}
	}
	public static void main(String[] args) {
		getSquare(3, 5);
	}

}
