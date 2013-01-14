package pk.edu.pucit.demo.gui;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import pk.edu.pucit.demo.db.DataAccessManager;
import pk.edu.pucit.demo.db.Student;

public class MainFrame {

	private JFrame frame;
	private JTextField txtRollnumber;
	private JTextField txtName;
	private JTextField txtSession;
	private JTextField txtCgpa;
	private JCheckBox chckbxPassedOut;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
            // Set System L&F
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
		} 
		catch (UnsupportedLookAndFeelException e) {
			// handle exception
		}
		catch (ClassNotFoundException e) {
			// handle exception
		}
		catch (InstantiationException e) {
			// handle exception
		}
		catch (IllegalAccessException e) {
			// handle exception
		}
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblRollnumber = new JLabel("Roll Number");
		frame.getContentPane().add(lblRollnumber);
		
		txtRollnumber = new JTextField();
		frame.getContentPane().add(txtRollnumber);
		txtRollnumber.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		frame.getContentPane().add(lblName);
		
		txtName = new JTextField();
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JLabel lblSession = new JLabel("Session");
		frame.getContentPane().add(lblSession);
		
		txtSession = new JTextField();
		frame.getContentPane().add(txtSession);
		txtSession.setColumns(10);
		
		JLabel lblCgpa = new JLabel("CGPA");
		frame.getContentPane().add(lblCgpa);
		
		txtCgpa = new JTextField();
		frame.getContentPane().add(txtCgpa);
		txtCgpa.setColumns(10);
		
		JLabel lblPassedOut = new JLabel("Passed Out");
		frame.getContentPane().add(lblPassedOut);
		
		chckbxPassedOut = new JCheckBox("");
		frame.getContentPane().add(chckbxPassedOut);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String rollNumber = txtRollnumber.getText();
				String name = txtName.getText();
				String session = txtSession.getText();
				float cgpa = Float.parseFloat(txtCgpa.getText());
				boolean passedOut = chckbxPassedOut.isSelected();
				
				Student s = new Student();
				s.setRollNumber(rollNumber);
				s.setName(name);
				s.setSession(session);
				s.setCgpa(cgpa);
				s.setPassedOut(passedOut);
				try {
					DataAccessManager.saveStudent(s);
					JOptionPane.showMessageDialog(frame, "Student has been saved in database.");
					txtRollnumber.setText("");
					txtName.setText("");
					txtSession.setText("");
					txtCgpa.setText("");
					chckbxPassedOut.setSelected(false);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		frame.getContentPane().add(btnSave);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmViewExistingUser = new JMenuItem("View Existing User");
		mntmViewExistingUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String[] rollNumbers = DataAccessManager.getAllRollNumber();
					if (rollNumbers.length>0){
						frame.setVisible(false);
						DetailFrame.init(frame);
					}else{
						JOptionPane.showMessageDialog(frame, "No Student record has been been saved yet.");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		mnFile.add(mntmViewExistingUser);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mnFile.add(mntmClose);
	}

}
