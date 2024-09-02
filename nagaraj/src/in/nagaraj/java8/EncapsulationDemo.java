package in.nagaraj.java8;

class Bank{
	 private int acc_bal ;
	public int getBal()
	{
		return acc_bal;
	}
	public void setBal(int amount)
	{
		acc_bal = amount;
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
 Bank b = new Bank();
 b.setBal(10000);
 
 System.out.println(b.getBal());

	}

}
