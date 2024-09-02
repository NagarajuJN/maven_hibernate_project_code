package org.nagaraj.classNotes;

//class Bank{
//	private int acc_num = 1233445;
//	 private int acc_bal = 10000;
//}
//
//
//// access the out side
//public class EncapsulationDemo {
//
//	public static void main(String[] args) {
//
//		Bank b = new Bank();
//		System.out.println("Bank Account Number:"+b.acc_num);
//
//		System.out.println("Bank  balance:"+b.acc_bal);
//	}
//
//}


// Example for Encap in Java

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

class EncapsulationDemo {
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.setBal(50000);
		System.out.println("Bank Bal is now ..."+b.getBal());
		
	}
	}


