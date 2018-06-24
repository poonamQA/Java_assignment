package com.ArrithmeticOprationAssignment;
/*
 * Exercise 1:
Create a payroll program for the part-time employee. 
display no of hours he/she worked, pay rate value and pay rate per month.
Input: no of hours he/she worked and pay rate value per hour
output: display both input values and salary of the person per month
Hint: create 3 double variables hoursWorked, pay rate and use multiplication operation
 */
public class CalculateSalary {

	private int hour;
	private double rate;
	private double salaryPerMonth;
	

	public CalculateSalary(int hour, double rate) {
		this.hour = hour;
		this.rate = rate;
		
	}
	public int getHour() {
		return this.hour;
	}

	public void setHour(int hour) {
			this.hour = hour;
	}	

	public double getRate() {
		return rate;
	
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getSalaryPerMonth() {
		salaryPerMonth =hour*rate;
		return salaryPerMonth;
	}

	public void display() {
		System.out.println("hour: "+hour);
		System.out.println("rate: "+rate);
		System.out.println("SalaryPerMonth: "+getSalaryPerMonth());
	}


	
	public static void main(String[] args) {
		
		CalculateSalary payroll = new CalculateSalary(10, 18);
		CalculateSalary payroll1 = new CalculateSalary(10, 18);
		payroll.display();
		payroll1.display();
		
	}
	
}