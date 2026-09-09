package com.pro;

public class MethodsExample {
	static MethodsExample obj;
	static {
		 obj =new MethodsExample();
		 method1();
		 method2();
		 obj.method3();
		 obj.method4();
		 
	}
	 
	static void method1()
	{
		System.out.println("static method1 called");
		
	}
	
	static void method2()
	{
		System.out.println("static method2 called");
		
	}
	void method3()
	{
		System.out.println("Instance method3");
		
	}
	void method4()
	{
		System.out.println("Instance method4");
	}

	public static void main(String[] args) {
	

	}

}
