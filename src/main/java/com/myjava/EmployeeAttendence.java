package com.myjava;

public class EmployeeAttendence {
	
	public static void main(String[] args) {
		
			System.out.println("Welcome to Employee Wage Computation");
			int wagPerHrs = 20;
			int workingHours;
			int totalWorkingHours = 0;
			int totalDays = 0;
			int counterForPresentFullTime=0;
			int counterForPresentHalfTime=0;
			int totalSalary=0;
			while( totalDays <= 19 && totalWorkingHours <= 100)
			{
				totalDays++;
				int employWorkingTime = (int)(Math.random() *3);
				switch(employWorkingTime) {
				case 1:
					workingHours=8;
					counterForPresentFullTime = counterForPresentFullTime + workingHours;
					if(counterForPresentFullTime == 100) {
						totalWorkingHours = 100;
					}
					break;
				case 2:
					workingHours=4;
					counterForPresentHalfTime = counterForPresentHalfTime + workingHours;
					if(counterForPresentHalfTime == 100 ) {
						totalWorkingHours = 100;
					}
					break;
				default:
					workingHours=0;
					break;
			}	
		}
			System.out.println("the days" +totalDays);
			System.out.println("the total working hours " +totalWorkingHours);

			if( totalDays == 20 ) {
				
				totalSalary= wagPerHrs * counterForPresentFullTime * totalDays;  
				System.out.println("employee for full time salery "+totalSalary);
				totalSalary= wagPerHrs * counterForPresentHalfTime * totalDays;  
				System.out.println("employee for half time salery "+totalSalary);		
			}
			else {
				
				totalSalary= wagPerHrs * totalWorkingHours;  
				System.out.println("employee for full time salery "+totalSalary);
				totalSalary= wagPerHrs * totalWorkingHours ;  
				System.out.println("employee for half time salery "+totalSalary);
			
			}
	}
}


