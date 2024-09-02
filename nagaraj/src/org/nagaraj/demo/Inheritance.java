package org.nagaraj.demo;
class Animal{
	public void walk()
{
		System.out.println("walking ");
		}
	public void breathe()
{
		System.out.println("breathing");
		}
}
class Dog extends Animal{
	
public void run() {
	System.out.println("Running");
}
}
 class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.run();
		d.breathe();
		d.walk();

	}

}
