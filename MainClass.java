package com.bridgelabz;
import java.util.*;

public class MainClass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. add student");
			System.out.println("2 delete student");
			System.out.println("3. update student");
			System.out.println("4.display student");
			System.out.println("exit");
			System.out.println("enter your choice ");
			 choice = sc.nextInt();
			System.out.println();
			switch(choice) {
			case 1: 
				System.out.println("add student ");
				System.out.println();
				System.out.println("enter student name");
				String name= sc.nextLine();
				System.out.println("enter student email");
				String email= sc.nextLine();
				System.out.println("enter student address");
				String address= sc.nextLine();
				System.out.println("enter student id");
				int id= sc.nextInt();
				StudentManagement.addStudent(id, name, email, address);
				break;
			case 2:
				System.out.println("enter student id to delete");
				int deleteId = sc.nextInt();
				System.out.println(deleteId);
				StudentManagement.deleteStudent(deleteId);
				break;
			case 3:
				System.out.print("Enter student ID to update: ");
                int updateId = sc.nextInt();
                System.out.print("Enter new name: ");
                String newName = sc.nextLine();
                System.out.print("Enter new email: ");
                String newEmail = sc.nextLine();
                System.out.print("Enter new address: ");
                String newAddress = sc.nextLine();
                StudentManagement.updateStudent(updateId, newName, newEmail, newAddress);
                break;
			case 4:
                StudentManagement.displayStudent();
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice");
        }      	
			}
		while(choice!=5);	
		}
	}


