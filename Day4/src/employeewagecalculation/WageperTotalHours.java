package employeewagecalculation;
public class WageperTotalHours {
	//Calculating Wage based on a condition that is total working hours of a month
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH=100;

	public static void main(String[] args) {

		int EmpHrs  = 0;
		int EmpWage = 0;
		int TotalEmpWage =  0;
		int TotalEmpHrs=0;
		int TotalWorkingDays=0;
		while(TotalEmpHrs <= MAX_HRS_IN_MONTH &&
				TotalWorkingDays < NUM_OF_WORKING_DAYS) {
			TotalWorkingDays++;
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
			TotalEmpHrs +=EmpHrs;
			EmpWage = EmpHrs * EMP_RATE_PER_HOUR;
			TotalEmpWage +=EmpWage;
			System.out.println("The Employee Wage is:" +EmpWage); 
		}
		System.out.println("Employee Totalwage is:" +TotalEmpWage);
	}

}
