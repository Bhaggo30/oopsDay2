package com.bridgelabz;

public class Manager extends Employee{
	int mId;
	
	public Manager(int eId, String eName, String eRole,int mId) {
		super(eId, eName, eRole);
		this.mId = mId;
		
	}
	
	@Override
	public void developer() {
		super.developer();
		System.out.println("manager is assigning work to developer");
	}@Override
	public void tester() {
		super.tester();
		System.out.println("manager is assigning work to tester");
	}@Override
	public void work() {
		super.work();
		System.out.println("employee is working under manager");
	}
	public void managerwork() {
		System.out.println("manager is handling the employee");
	}

	@Override
	public String toString() {
		return "Manager [mId=" + mId + ", eId=" + eId + ", eName=" + eName + ", eRole=" + eRole + "]";
	}

	
	
}
