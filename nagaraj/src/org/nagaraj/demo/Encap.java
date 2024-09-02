package org.nagaraj.demo;
class Bank1{
	private int acc_bal;
	int get_bal() {
		return acc_bal;
	}
	
	void set_bal(int deposit)
{
		acc_bal = deposit;
}
}
public class Encap {

	public static void main(String[] args) {
		Bank1 b = new Bank1();
			
		b.set_bal(10000);
		System.out.println(b.get_bal());
}
}