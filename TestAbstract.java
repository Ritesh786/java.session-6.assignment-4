package com.Ritesh.test;

import com.Ritesh.tools.*;

public class TestAbstract {

	public static void main(String[] args) {
		Abstract2 obj =  new Abstract2();
		System.out.println("Student Name is   " +obj.StudentName("Goslin"));
		System.out.println("Student Roll number is  " +obj.StudentRollNo(85));
		System.out.println("Student Registration number is " +obj.StudentRegisterno(105));
	}

}
