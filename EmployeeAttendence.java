package com.myjava;

public class EmployeeAttendence {
	
	public static void main(String[] args) {
		
			System.out.println("Welcome to Employee Wage Computation");
			int WagPerHrs = 20;
			int FullTime = 8;
			int PartTime = 4;
			int TotalSal;
			int Isfor = (int)(Math.random() * 3);
			switch(Isfor) {
			case 1:
				System.out.println("Employee is present for full time");
				TotalSal = WagPerHrs * FullTime;
				break;
			case 2:
				System.out.println("Employee is present for part time");
				TotalSal = WagPerHrs * PartTime;
				break;
			default:
				System.out.println("Employee is not present");
				TotalSal = WagPerHrs * FullTime * Isfor;
				break;
		}
		System.out.println("The total salary is " +TotalSal);
	}

}
