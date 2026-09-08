package com.pro;

public class StudentDet {
	
	static String  college = "JNTU";
	String name;
	int age;
	void display()
	{
		System.out.println("Name of the college :" + college);
		System.out.println("Name :" + name);
		System.out.println("age :" + age);
		
	}

	public static void main(String[] args) {
		StudentDet s1 = new StudentDet();
		s1.name = "Mahitha";
		s1.age = 21;
		StudentDet s2 = new StudentDet();
		s2.name = "Mahi";
		s2.age = 22;
		s1.display();
		s2.display();
		
	}

}
