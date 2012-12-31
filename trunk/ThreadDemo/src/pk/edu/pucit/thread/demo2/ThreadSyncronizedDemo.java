package pk.edu.pucit.thread.demo2;

public class ThreadSyncronizedDemo extends Thread{
	private static Integer count = 0;
	private static Object lock = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (lock) {
			for(int i=0; i<10000; ++i){				
				ThreadSyncronizedDemo.count++;
			}
		}
	}
	
	public static int getCount() {
		return ThreadSyncronizedDemo.count;
	}
	
	
}
