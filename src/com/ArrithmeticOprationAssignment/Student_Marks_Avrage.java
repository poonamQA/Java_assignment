package com.ArrithmeticOprationAssignment;
/*
 * Repeat the above program for 3 students
hint: don't run 3 time - use loop to run 3 times
 */
public class Student_Marks_Avrage {

	public static void main(String[] args) {
		int sub1 = 99;
		int sub2 = 88;
		int sub3 = 77;
		int sub4 =78;
		int sub5 = 82;
		int sub6 = 84;
		int n = 6;
		
		int total = sub1+sub2+sub3+sub4+sub5+sub6;
		for(int i=1;i<=3;i++) {
		int avrage = total/n;
		System.out.println("Total marks : "+total);
		System.out.println("Avrage marks of student is:"+ avrage);
		}
		

	}

}
