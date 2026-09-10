package com.pro;

public class DataTypes {
	 int empid;
	 short age;
	 float sal;
	 char grade;
	 int yop;
	 boolean active;
	 int leaves;
	 double phoneno;
	 //int availableLeaves=leaves;
	 	  void display() {
		  System.out.println("empid :" + empid);
		  System.out.println("age :" + age);
		  System.out.println("sal :" + sal);
		  System.out.println("grade :" + grade);
		  System.out.println("yop :" + yop);
		  System.out.println("active:" + active);
		  System.out.println("leaves :"+ leaves);
		  System.out.println("phoneno :" + phoneno);
	  }
	 	  
            void leave(){
            	leaves--;
            }
	public static void main(String[] args) {
		DataTypes d1= new DataTypes();
		d1.empid = 101;
		d1.age = 21;
		d1.sal = 50000.50f;
		d1.grade='A';
		d1.yop=2026;
		d1.active=true;
		d1.leaves=5;
		d1.phoneno=8774899938d;
		
		DataTypes d2= new DataTypes();
		d2.empid = 102;
		d2.age = 22;
		d2.sal = 48000.50f;
		d2.grade='B';
		d2.yop=2026;
		d2.active=true;
		d2.leaves=4;
		d2.phoneno=8774892238d;
		d1.leave();
		d2.leave();
		d1.display();
		d2.display();
		
		
	}

}
