package pk.edu.pucit.serializabledemo;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StudentManagmentSystemUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JCheckBox chckbxPassedOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentManagmentSystemUI window = new StudentManagmentSystemUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentManagmentSystemUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 11, 66, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(86, 8, 116, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblRollnumber = new JLabel("RollNumber");
		lblRollnumber.setBounds(10, 36, 66, 14);
		frame.getContentPane().add(lblRollnumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 33, 116, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		chckbxPassedOut = new JCheckBox("Passed Out");
		chckbxPassedOut.setBounds(86, 57, 116, 23);
		frame.getContentPane().add(chckbxPassedOut);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				Student std = new Student();
				std.setName(textField.getText());
				std.setRollNumber(textField_1.getText());
				std.setPassedOut(chckbxPassedOut.isSelected());
				ObjectOutputStream oos = null;
				try {
					oos = new ObjectOutputStream(new FileOutputStream("objects"));
					oos.writeObject(std);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally{
					if(oos!=null)
						try {
							oos.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}					
				}

			}
		});
		btnSave.setBounds(86, 87, 116, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnViewAlreadySaved = new JButton("View Already Saved Object");
		btnViewAlreadySaved.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Student std = null;
				ObjectInputStream ios = null;
				try {
					ios = new ObjectInputStream(new FileInputStream("objects"));
					std = (Student)ios.readObject();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally{
					if(ios!=null)
						try {
							ios.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}					
				}
				if(std!=null)
					JOptionPane.showMessageDialog(null, std);
					
			}
		});
		btnViewAlreadySaved.setBounds(10, 121, 192, 23);
		frame.getContentPane().add(btnViewAlreadySaved);
	}
}
