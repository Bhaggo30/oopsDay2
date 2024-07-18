package com.bridgelabz;

public class Employee {
	private String EName;
	private String Erole;
	private double salary;
	public Employee(String eName, String erole, double salary) {
		super();
		EName = eName;
		Erole = erole;
		this.salary = salary;
	}
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		EName = eName;
	}
	public String getErole() {
		return Erole;
	}
	public void setErole(String erole) {
		Erole = erole;
	}
	public double getSalary() {
		return salary;
	}
	public double setSalary(double salary) {
		return this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [EName=" + EName + ", Erole=" + Erole + ", salary=" + salary + "]";
	}
	    
}
