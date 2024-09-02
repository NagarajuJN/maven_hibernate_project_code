package org.nagaraj.demo;

/*
class Bank{
	private int acc_number = 132434;
	private int acc_bal = 10000;
	
}
class Encapsulation{
	public static void main(String args[])
	{
		Bank b = new Bank();
		System.out.println("Bank Account number :"+b.acc_number);

		System.out.println("Bank bal:"+b.acc_bal);
	}
}
*/
//Example Encapsulation

class Bank{
	
	private int acc_bal;
	public int getBal()
	{
		return acc_bal;
	}
	public void setBal(int amount)
	{
		acc_bal = amount;
	}
}

class Encapsulation{
	public static void main(String args[])
	{
		Bank b = new Bank();
		b.setBal(10000);
		System.out.println("Bank bal... now is :"+b.getBal());
	}
}













