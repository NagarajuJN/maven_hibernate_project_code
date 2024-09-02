package org.nagaraj.classNotes;

class Timer{
	int count;
	
		public synchronized void inc_count()
		{
			count++; // count = count+1
		}
	}

public class SyncDemo {

	public static void main(String[] args) throws Exception {

		Timer c = new Timer();
		
		Thread t1 = new Thread(new Runnable()
				{
				public void run()
				{
					for(int i= 1;i<=1000;i++)
					{
						c.inc_count();
					}
				}
				});
		Thread t2 = new Thread(new Runnable()
		{
		public void run()
		{
			for(int i= 1;i<=1000;i++)
			{
				c.inc_count();
			}
		}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(" timer is :"+c.count);

	}

}
