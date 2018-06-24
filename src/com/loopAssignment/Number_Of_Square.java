package com.loopAssignment;
/*
 * Exercise 1:
create a loop to display first 10 numbers with their square values
output e.g: 
1 1
2 4
3 9
4 16
5 25
6 36
7 49
8 64
9 81
10 100
 */
public class Number_Of_Square {

	public void getSquare() {
		int square = 0;
		//loop start with 1 and it goto the 10
		for(int i=1;i<=10;i++) {
			 square = i *i;
			 System.out.println(i+"->"+square);
		}
	}
	
	public static void main(String[] args) {
			//create a object of class
			Number_Of_Square e = new Number_Of_Square();
			//calling getSqe method
			e.getSquare();
	}

}
