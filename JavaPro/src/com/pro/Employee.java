package com.pro;

public class Employee {
	static int count;

	Employee(){
	count++;
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Employee emp4 = new Employee();
		
		System.out.println("Objects count :" + count);
		
	}

}
