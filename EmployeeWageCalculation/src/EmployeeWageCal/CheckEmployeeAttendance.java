package EmployeeWageCal;

public class CheckEmployeeAttendance {

	    public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		//Check Whether Employee is Present or Not
		double EmpCheck=Math.floor(Math.random()*10)% 2;
		if(EmpCheck==IS_FULL_TIME)
				System.out.println("Employee is Present");
		else
				System.out.println("Employee is Absent");
		}
}
