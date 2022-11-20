package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("student name");
		
	}
	
	public void studentDept() {
		System.out.println("student department");
	}
	
    public void studentID() {
    	System.out.println("Student id");
    }
	
	public static void main(String[] args) {
		Student details = new Student();
		details.studentName();
		details.studentID();
		details.studentDept();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
		details.deptName();

	}


}
