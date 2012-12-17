package pk.edu.pucit.generics;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		ArrayList al = new ArrayList();
		LinkedList<String> ll = new LinkedList<String>();
		
		
		al.add(1);
		al.add(3.14);
		al.add("MITF11");
		al.add(new StudentBean());
		
		int a = (int)al.get(0);
		float b = (float)(double)al.get(1);
		String c = (String)al.get(2);
		StudentBean d = (StudentBean)al.get(3);
		
		System.out.println("success 1");
		
		for(int i=0; i<100; ++i){
			ll.add(""+i);
		}
		
		for(int i = 0; i<100 ; ++i){
			String t = ll.get(i);
		}
		
		System.out.println("success 2");
		
		ClassicQueue<Integer> cll = new ClassicQueue<Integer>();
		
		for(int i=0; i<10; ++i){
			cll.add(i);
		}
		
		for(int i=0; i<10; ++i){
			System.out.println(cll.remove());
		}
		
		System.out.println("success 3");
		
	}

}
