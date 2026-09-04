package com.pro;

public class Objcount {
	static int count;
	{
		count++;
	}

	public static void main(String[] args) {
		Objcount obj1= new Objcount();
		Objcount obj2= new Objcount();
		Objcount obj3= new Objcount();
		Objcount obj4= new Objcount();
		System.out.println("Object count :" + count);
		

	}

}
