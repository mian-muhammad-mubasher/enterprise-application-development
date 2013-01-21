package pk.edu.pucit.ead.demo.np;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private static Socket s;
	private static JTextArea txtrMain;
	private static JTextArea txtrInput;
	/**
	 * Launch the application.
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		s = new Socket("localhost", 9000);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		while(true){
			byte[] b = new byte[1000];
			int l = s.getInputStream().read(b);
			String msg = txtrMain.getText()+'\n'+ new String(b,0,l);
			txtrMain.setText(msg);
		}
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtrMain = new JTextArea();
		txtrMain.setEditable(false);
		frame.getContentPane().add(txtrMain, BorderLayout.CENTER);
		
		txtrInput = new JTextArea();
		frame.getContentPane().add(txtrInput, BorderLayout.SOUTH);
		
		JButton btnSend = new JButton("send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t = txtrInput.getText();
				try {
					s.getOutputStream().write(t.getBytes());
					txtrInput.setText("");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(btnSend, BorderLayout.EAST);
	}

}
