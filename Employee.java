package com.bridgelabz;

public class Employee {
	int eId;
	String eName;
	String eRole;
	public Employee(int eId, String eName, String eRole) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eRole = eRole;
	}
	public void work() {
		System.out.println("employee is working");
	}
	public void tester() {
		System.out.println("tester team test the application");
	}
	public void developer() {
		System.out.println("developer team develop the application");
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eRole=" + eRole + "]";
	}
	
	

}
