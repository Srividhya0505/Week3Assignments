package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Srividhya S");

	}
	
	public void studentDept() {
		System.out.println("Electrical and Electronics");
	}
	
	public void studentid() {
		System.out.println("51368127");
	}
	
	public static void main(String[] args) {
		Student mystudent = new Student();
		mystudent.studentName();
		mystudent.studentDept();
		mystudent.studentid();
		
		//calling from Parent 
		
		mystudent.departmentName();
		
		//calling from Grandparent
		mystudent.collegeName();
		mystudent.collegeCode();
		mystudent.collegeRank();
		
	}
	
}
