package org.nagaraj.demo;
abstract class Vehicles{
	public abstract int getNoOfWheels();
}
class Bus extends Vehicles{
	public int getNoOfWheels() {
		return 6;
	}
}
class Car extends Vehicles{
	public int getNoOfWheels(){
		return 4;
	}
}
public class ExampleAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bus b = new Bus();
System.out.println(b.getNoOfWheels());
Car c = new Car();
System.out.println(c.getNoOfWheels());

	}

}
