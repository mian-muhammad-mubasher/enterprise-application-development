package pk.edu.pucit.thread.main;

import pk.edu.pucit.thread.demo1.SimpleThreadUsingRunnable;
import pk.edu.pucit.thread.demo1.SimpleThreadUsingThread;
import pk.edu.pucit.thread.demo2.ThreadSyncronizedDemo;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Demo 1
		Thread thread1 = new Thread(new SimpleThreadUsingRunnable("MITF11-1"));
		Thread thread2 = new Thread(new SimpleThreadUsingRunnable("MITF11-2"));
		Thread thread3 = new SimpleThreadUsingThread("MITF11-3");
		Thread thread4 = new SimpleThreadUsingThread("MITF11-4");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		// Demo 2
		ThreadSyncronizedDemo tsd1 = new ThreadSyncronizedDemo();
		ThreadSyncronizedDemo tsd2 = new ThreadSyncronizedDemo();
		ThreadSyncronizedDemo tsd3 = new ThreadSyncronizedDemo();
		ThreadSyncronizedDemo tsd4 = new ThreadSyncronizedDemo();

		ThreadSyncronizedDemo tsd5 = new ThreadSyncronizedDemo();
		ThreadSyncronizedDemo tsd6 = new ThreadSyncronizedDemo();
		ThreadSyncronizedDemo tsd7 = new ThreadSyncronizedDemo();
		ThreadSyncronizedDemo tsd8 = new ThreadSyncronizedDemo();
		
		tsd1.start();
		tsd2.start();
		tsd3.start();
		tsd4.start();
		
		tsd5.start();
		tsd6.start();
		tsd7.start();
		tsd8.start();
		
		while(tsd1.isAlive() || tsd2.isAlive() || tsd3.isAlive() || tsd4.isAlive() || tsd5.isAlive() || tsd6.isAlive() || tsd7.isAlive() || tsd8.isAlive());
		
		System.out.println(ThreadSyncronizedDemo.getCount());
	}

}
