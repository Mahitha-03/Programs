package com.pro;

public class Test {
	static int x=5;
	{
		x+=10;
		System.out.println(x);
	}

	public static void main(String[] args) {
		new Test();
		new Test();

	}

}
