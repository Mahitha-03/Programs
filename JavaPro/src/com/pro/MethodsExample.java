package com.pro;

public class MethodsExample {
	static MethodsExample obj;
	static {
		 obj =new MethodsExample();
		
	}
	 
	static void method1()
	{
		System.out.println("static method1 called");
		method2();
		
	}
	
	static void method2()
	{
		System.out.println("static method2 called");
		obj.method3();
		
	}
	void method3()
	{
		System.out.println("Instance method3");
		obj.method4();
		
	}
	void method4()
	{
		System.out.println("Instance method4");
	}

	public static void main(String[] args) {
	 method1();

	}

}
