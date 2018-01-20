package College.cse;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
private int empNumber;
private String empName;
private Date joiningDate;
private double salary;



public Employee(int empNumber, String empName,  double salary) {
	
	this.empNumber = empNumber;
	this.empName = empName;
	//this.joiningDate = joiningDate;
	this.salary = salary;
}

public int getEmpNumber() {
	return empNumber;
}
public void setEmpNumber(int empNumber) {
	this.empNumber = empNumber;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Date getJoiningDate() {
	return this.joiningDate;
	
}
public void setJoiningDate(Date joiningDate) {

	this.joiningDate=joiningDate;	

}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

public String empDetails() {
	return "Employee Numbers is: " +this.getEmpNumber() + "\nEmployee Name: " + this.getEmpName() + "\nJoining Date of Employee: " + this.getJoiningDate() + "\nSalary of Employee is: " + this.getSalary();
}



}
