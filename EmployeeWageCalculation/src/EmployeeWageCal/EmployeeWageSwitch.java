package EmployeeWageCal;

public class EmployeeWageSwitch {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {
		int EmpHrs  = 0;
		int EmpWage = 0;
		double EmpCheck=Math.floor(Math.random()*10)% 3;
		switch ((int)EmpCheck) {
		case IS_FULL_TIME:
			EmpHrs = 8;
			break;
		case IS_PART_TIME:
			EmpHrs = 4;
			break;
		default:
			EmpHrs = 0;
		}
		EmpWage = EmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("The Employee Wage is:" +EmpWage);


	}

}
