package com.ArrithmeticOprationAssignment;
/*
 * Your university asked you to develop a java application to calculate the average of the student's 
 * performance. Create 6 int variables sub1,sub2,...sub6. give some values to subjects and find the 
 * total marks and average of the student

 */
public class Find_Avrage {

	public static void main(String[] args) {
		
		int sub1 = 99;
		int sub2 = 88;
		int sub3 = 77;
		int sub4 =78;
		int sub5 = 82;
		int sub6 = 84;
		int n = 6;
		int total = sub1+sub2+sub3+sub4+sub5+sub6;
		
		int avrage = total/n;
		System.out.println("Total marks : "+total);
		System.out.println("Avrage marks of student is:"+ avrage);
		
		

	}

}
