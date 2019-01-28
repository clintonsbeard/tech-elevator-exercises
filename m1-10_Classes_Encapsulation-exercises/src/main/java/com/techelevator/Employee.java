package com.techelevator;

public class Employee {

	/* Data Members */
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private double annualSalary;
	
	/* Derived Property */
	
	public String getFullName() {
		return lastName + ", " + firstName;
	}
	
	/* Constructor */
	
	public Employee(int employeeId, String firstName, String lastName, double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = salary;
	}
	
	/* Getters and Setters */
	
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}

	/* Methods */
	
	public void raiseSalary(double percent) {
		annualSalary = annualSalary + ((annualSalary / 100) * percent);
	}
	
}