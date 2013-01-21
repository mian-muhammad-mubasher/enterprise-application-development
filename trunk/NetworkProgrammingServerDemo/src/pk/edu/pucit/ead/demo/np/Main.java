package pk.edu.pucit.ead.demo.np;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	private static final int PORT = 9000; 
	private static LinkedList<Socket> sl = new LinkedList<Socket>();
	
	public static Socket[] getClientSockets(){
		Socket[] retval = new Socket[sl.size()];
		retval = sl.toArray(retval);
		return retval;
	}	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Server is running");
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(PORT);
		int port = ss.getLocalPort();
		System.out.println("The port is: "+port);
		while(true){
			Socket s = ss.accept();
			sl.add(s);
			new ClientThread(s);
		}
	}

}
