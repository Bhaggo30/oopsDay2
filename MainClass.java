package com.bridgelabz;

public class MainClass {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"tom","developer");
		Employee e2 = new Employee(102, "jerry", "tester");
		System.out.println("display the details of developer "+e1);
		e1.developer();
		System.out.println("display the details of tester"+e2);
		e2.tester();
	    Manager m1 = new Manager(101,"tom","tester",201);
	    System.out.println("manager 1 details "+m1);
	    Manager m2 = new Manager(102, "jerry", "tester", 202);
	    System.out.println("manager 2 details "+m2);
	    m1.managerwork();
	    
		
	}

}
