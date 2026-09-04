package com.pro;

public class Gcexample {
	Gcexample obj;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}

	public static void main(String[] args) {
System.out.println("main method started");
		
        Gcexample ob1 = new Gcexample();
        Gcexample ob2 = new Gcexample();
		ob1= null;    // nullifying
		System.out.println(ob1);
		System.out.println(ob2);
		Gcexample ob3= new Gcexample();
		ob3= ob2;      // reassigning
		
		System.out.println(ob2);
		System.out.println(ob3);
		new Gcexample(); // anonymous
		{
		Gcexample ob4 = new Gcexample();  // out of scope
		 System.out.println("inside block");
			System.out.println(ob4);
		}
		Gcexample ob5 = new Gcexample();
		Gcexample ob6 = new Gcexample();
		ob5.obj=ob6;
		ob6.obj=ob5;
		ob5 = null;
		ob6 = null;    // island isolation
		System.gc();    
		System.out.println("main method ended");
	
	}

}
