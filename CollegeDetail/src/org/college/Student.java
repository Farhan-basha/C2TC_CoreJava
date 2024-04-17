package org.college;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student name is Farhan");
		}
		public void studentDept() {
		System.out.println("Student department is CSE");
		}
		public void studentId() {
		System.out.println("Student ID is 302");
		}
		public static void main(String[] args) {
		Student student = new Student();
		student.studentName();
		student.studentDept();
		student.studentId();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.hostelName();
		}

}
