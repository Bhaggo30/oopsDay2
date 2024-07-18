package com.bridgelabz;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee("tom","asociate",23000.00);
		Employee e2 = new Employee("jerry","developer",28900.00);
		Employee e3 = new Employee("jack","tester",21200.00);
		Employee e4 = new Employee("smith","tecnical",23045.00);
		
		Methods m=new Methods();
		System.out.println(e4.toString());
		System.out.println(e3.toString());
		m.updateSalary(e4, 7);
		m.updateSalary(e3, 7);
		System.out.println(e4.toString());
		System.out.println(e3.toString());
		
		
		
		
		
		
		
		
		
	}
	

}
