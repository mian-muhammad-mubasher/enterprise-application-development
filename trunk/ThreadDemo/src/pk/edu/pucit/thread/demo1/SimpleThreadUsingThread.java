package pk.edu.pucit.thread.demo1;

public class SimpleThreadUsingThread extends Thread {
	
	public SimpleThreadUsingThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		for(int i=0; i<100; ++i){			
			System.out.println(this.getName());
		}
	}
	
}
