package org.nagaraj.classNotes;

class Display  extends Thread{
	public void run()
	{
		for(int i = 1 ; i<=5 ;i++)
		{
			System.out.println("Hi");
			try{Thread.sleep(2000);} catch(Exception e) {}		
	}
	}
}
class Msg  extends Thread{
	public void run()
	{
		for(int i = 1 ; i<=5 ;i++)
		{
			System.out.println("wel come");
			try{Thread.sleep(2000);} catch(Exception e) {}
		}
	}
}

public class ThreadDemo{

	public static void main(String[] args) {

		Display obj1 = new Display();
		Msg obj2 = new Msg();
		obj1.start(); // it will 
		obj2.start();
		
	}

	
}
