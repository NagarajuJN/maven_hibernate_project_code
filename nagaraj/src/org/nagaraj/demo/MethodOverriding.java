package org.nagaraj.demo;

class Parent{
	public void properties(){
		System.out.println(" Land + gold+money");
	}
	public void marry() {
		System.out.println("subbi");
	}
}
class Child extends Parent{
	public void marry() {
		System.out.println("Katrina");
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {

		Parent p = new Parent();
		Child c =  new Child();

		p.marry();
		c.marry();
		
		Parent p1 = new Child();
		p1.marry();
		
	}

}
