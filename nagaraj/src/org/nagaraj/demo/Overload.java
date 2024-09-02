package org.nagaraj.demo;
 class Test{
	public void m1() {
		System.out.println("No org");
	}
	public void m1(int i ) {
		System.out.println("int org");
	}
	public void m1(double d) {
		System.out.println("double org");
	}
	}
public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.m1();
		t.m1(10);
		t.m1(10.9);

	}

}
