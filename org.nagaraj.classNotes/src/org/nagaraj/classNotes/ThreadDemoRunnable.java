package org.nagaraj.classNotes;

class Display1 implements Runnable{
	public void run()
	{
		for(int i = 1 ; i<=5 ;i++)
		{
			System.out.println("Hi");
			try{Thread.sleep(2000);} catch(Exception e) {}		
	}
	}
}
class Msg1 implements Runnable{
	public void run()
	{
		for(int i = 1 ; i<=5 ;i++)
		{
			System.out.println("wel come");
			try{Thread.sleep(2000);} catch(Exception e) {}
		}
	}
}

public class ThreadDemoRunnable {

	public static void main(String[] args) {

	

			Runnable obj1 = new Display1();
			Runnable obj2 = new Msg1();
			
			Thread t1 = new Thread(obj1);
			Thread t2 = new Thread(obj2);
			t1.start();
			try{Thread.sleep(5000);} catch(Exception e) {}
	
			t2.start();
			
			
			
	
			

	}

}
