package org.student;

public class StudentInfo {
	
	public void getStudentInfo(int id) {
		System.out.println("ID: " +id);
	}
	
	public void getStudentInfo (int id, String name){
		System.out.println("Id and name: " +id+", " +name);
	
	}
	
	public void getStudentInfo (String mail, long phoneno) {
		System.out.println("Email and PhoNo: " +mail+", " +phoneno);
	
	}
	public static void main(String[] args) {
		StudentInfo test = new StudentInfo();
		test.getStudentInfo(21);
		test.getStudentInfo(21,"Karthik");
		test.getStudentInfo("harshadkarthik@gmail.com", 9710417797L);

	}


}
