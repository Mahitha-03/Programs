package com.pro;

public class Square {
	byte square(byte n) {
		byte result = (byte)(n * n);
		System.out.println("Square root of " + n +  ":" + result);
		return result;
		
	}
	int square(int n) {
		int result = n * n;
		System.out.println("Square root of " + n +  ":" + result);
		return result;
	}
	float square(float n) {
		float result = n * n;
		System.out.println("Square root of " + n +  ":" + result);
		return result;
	}
	double square(double n) {
		double result = n * n;
		System.out.println("Square root of " + n +  ":" + result);
		return result;
	}
	long square(long n) {
		long result = n * n;
		System.out.println("Square root of " + n +  ":" + result);
		return result;
	}

	void square1(int n) {
		int result = n * n;
		System.out.println("Square root of " + n +  ":" + result);
		//return result;
	}
	public static void main(String[] args) {
		Square s= new Square();
		s.square((byte)7);
		s.square(8);
		s.square(9.5f);
		s.square(10.0);
		s.square(12.5);
		s.square1(4);
		
	}

}
