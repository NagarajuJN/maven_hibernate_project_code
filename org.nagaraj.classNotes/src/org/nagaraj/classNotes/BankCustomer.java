package org.nagaraj.classNotes;


class Customer1{
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("Trying to withdraw the amount");
		if(this.amount<amount)
		{
			System.out.println("Sorry less balance: pls do deposite i am waiting!!!");
		}
		try{wait();}catch(Exception e) {};
	
	
	this.amount-=amount; // with draw amount and update the new bal
	
		System.out.println("collect maoney: withdraw is completed---");
	}

		synchronized void deposit(int amount) {
			System.out.println("doing the deposit ....");
			this.amount+=amount; // deposit the new amount
			System.out.println("Deposit is completed");
			notify();
	
}
}

public class BankCustomer {

	public static void main(String[] args) {
		final Customer1 c = new Customer1();
		new Thread() {
			public void run() {
				c.withdraw(12000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(15000);
			}
		}.start();

	}

}
