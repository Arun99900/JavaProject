package employeewagecalculation;

public class EmployeeMonthyWage {
	//Calculating Wage for a Month
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;

	public static void main(String[] args) {
		int EmpHrs  = 0;
		int EmpWage = 0;
		int TotalEmpWage =  0;
		for(int day=0; day < NUM_OF_WORKING_DAYS; day++) {
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
			TotalEmpWage +=EmpWage;
			System.out.println("The Employee Wage is:" +EmpWage); 
		}
		System.out.println("Employee Totalwage is:" +TotalEmpWage);
	}
}
