package com.bridgelabz;

public class Methods {
	public void updateSalary(Employee e,double Salary) 
	{
		//e.setSalary(e.getSalary()*(n/100));
		//e.setSalary(e.setSalary(n)*100);
		double currentSalary1 = e.getSalary();
	    double updatedSalary = currentSalary1 * (1 + 0.5 / 100);
	    e.setSalary(updatedSalary);
    }

}
