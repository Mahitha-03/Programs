package com.pro;

public class MethodsEx1 {
	void addition(int a, int b) {
		
		int result= a + b;
		System.out.println("Addition:" + result);
		subtraction(result,5);
	}
	void subtraction(int a, int b) {
		
		int result = a - b;
		System.out.println("Subtraction:" + result);
		multiplication(result,10);
	}
	void multiplication(int a, int b) {

		int result = a * b;
		System.out.println("multiplication:" + result);
		division(result,3);
	}
	void division(int a, int b) {
		
		int result= a / b;
		System.out.println("division:" + result);
	}
	public static void main(String[] args) {
		MethodsEx1 e1 = new MethodsEx1();
		
		e1.addition(10,20);
	}

}
