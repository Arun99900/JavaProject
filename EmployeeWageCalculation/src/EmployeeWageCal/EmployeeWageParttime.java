package EmployeeWageCal;

public class EmployeeWageParttime {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME =  2;
		int EMP_RATE_PER_HOUR= 20;
		int EmpHrs  = 0;
		int EmpWage = 0;
		double EmpCheck=Math.floor(Math.random()*10)% 3;
		if(EmpCheck == IS_FULL_TIME)
			EmpHrs=8;
		else 
			if(EmpCheck == IS_PART_TIME)
				EmpHrs=4;
		EmpWage = EmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("The Employee Wage is:" +EmpWage);


	}

}
