package pk.edu.pucit.thread.demo1;

public class SimpleThreadUsingRunnable implements Runnable {
	
	private String name;
	
	public SimpleThreadUsingRunnable(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<100; ++i){			
			System.out.println(this.getName());
		}
	}
	
	public String getName() {
		return name;
	}
	
}
