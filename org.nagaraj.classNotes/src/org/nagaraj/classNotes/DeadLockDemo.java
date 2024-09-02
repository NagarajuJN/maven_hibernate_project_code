package org.nagaraj.classNotes;

public class DeadLockDemo {

	public static void main(String[] args) {
		
		final String res1 = "Ramkesh";
		final String res2 = " Suresh";
		
		
		Thread t1= new Thread()
		{
		public void run()
		{
			synchronized(res1)
			{
				System.out.println("Thread 1: res1 is locked !!!");
			}
		
		try{Thread.sleep(1000);} catch(Exception e) {}
		
		
			synchronized(res2)
			{
				System.out.println("Thread 1: res1 is locked !!!");
			}
			}
		
	};
	
		Thread t2= new Thread()
		{
		public void run()
		{
			synchronized(res2)
			{
				System.out.println("Thread 2: res2 is locked !!!");
			
		
		try{Thread.sleep(1000);} catch(Exception e) {};
		
		
			synchronized(res1)
			{
				System.out.println("Thread 2: res1 is locked !!!");
			}
			}
	
			}
		};
		t1.start();
		t2.start();
		
		
		}
	}
		
		

