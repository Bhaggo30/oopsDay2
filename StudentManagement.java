package com.bridgelabz;

public class StudentManagement {
	static Student []  students = new Student[100];
	static int studentCount =0;
	
	public static void addStudent(int id,String name,String email,String address) {
		if(studentCount<100) {
			students[studentCount] = new Student(id, name, email, address);
				studentCount++;
			}
		else {
			System.out.println("maximum number of student is reached");
		}
	}
	public static int findStudentById(int id) {
		for(int i=0; i<studentCount;i++) {
			if(students[i].id==id) {
				return i;
				
			}
		}
		return-1;
	}
	public static void deleteStudent(int id) {
		int index = findStudentById(id);
		if(index !=-1) {
			for(int i = index; i<studentCount-1; i++) {
				students[i] = students[i+1];
			}
			students[studentCount-1] = null;
			studentCount--;
		}
		else {
			System.out.println("student not found");
		}
	}
	public static void updateStudent(int id,String name,String email,String address) {
		int index = findStudentById(id);
		if(index!=-1) {
			students[studentCount].name = name;
			students[studentCount].email = email;
			students[studentCount].address=address;
		}
		else {
			System.out.println("student not found");
		}
	}
	public static void displayStudent() {
		for(int i=0; i<studentCount;i++)
		System.out.println("student :+(i+1)+ ");
		System.out.println("id :"+students[studentCount].id);
		System.out.println("name :"+students[studentCount].name);
		System.out.println("email :"+students[studentCount].email);
		System.out.println("address :"+students[studentCount].address);
		System.out.println();
	}
	
	
	
	
	
}
	



