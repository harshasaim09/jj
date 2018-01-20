package College.dept;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import College.cse.Employee;

public class EmployeeDriver {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2018, 05, 25);
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2018, 04, 19);
		Calendar cal3 = Calendar.getInstance();
		cal3.set(2018, 06, 04);
		
	Employee emp1 = new Employee(100, "Harsha" , 1000.01);
	Employee emp2 = new Employee(200, "Kiran" , 2000.01);
	Employee emp3 = new Employee(300, "Venky", 3000.01);

	emp1.setJoiningDate(cal.getTime());
	emp2.setJoiningDate(cal2.getTime());
	emp3.setJoiningDate(cal3.getTime());
	System.out.println(emp1.empDetails());
	System.out.println("*****************************************************");
	System.out.println(emp2.empDetails());
	System.out.println("*****************************************************");
	System.out.println(emp3.empDetails());
	}
}
