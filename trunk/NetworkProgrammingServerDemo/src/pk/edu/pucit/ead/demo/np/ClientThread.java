package pk.edu.pucit.ead.demo.np;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientThread extends Thread {
	
	private Socket s;
	
	public ClientThread(Socket s) {
		// TODO Auto-generated constructor stub
		this.s = s;
		start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		InputStream in = null;
		try {
			in = s.getInputStream();
			byte[] b = new byte[1000];  
			while(true){
				String IP = s.getInetAddress().getHostAddress();
				int l = in.read(b);
				String msg = IP+": "+new String(b,0,l);
				System.out.println(msg);
				b = msg.getBytes();
				Socket[] sArr = Main.getClientSockets();
				for(Socket s : sArr){
					s.getOutputStream().write(b);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
