package pk.edu.pucit.demo.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import pk.edu.pucit.demo.db.RemoteDataAccessManager;
import pk.edu.pucit.demo.db.Student;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.SQLException;

public class DetailFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -730811252976840814L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void init(final JFrame parentFrame) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetailFrame frame = new DetailFrame(parentFrame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param parentFrame 
	 */
	
	public JFrame getDetailFrame(){
		return this;
	}
	
	public DetailFrame(final JFrame parentFrame) {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				parentFrame.setVisible(true);
				getDetailFrame().dispose();
			}
		});
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		table = new JTable();
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Roll Number", "Name", "Session", "CGPA", "Passed Out"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = -3389523691076224030L;
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Float.class, Boolean.class
			};
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		try {
			Registry r = LocateRegistry.getRegistry("localhost");
			RemoteDataAccessManager rdam = (RemoteDataAccessManager)r.lookup("remoteDataAccessManager");
			String [] rollNumbers = rdam.getAllRollNumber();
			for (String rollNumber : rollNumbers){
				Student s = rdam.getStudent(rollNumber);
				Object [] row = {s.getRollNumber(), s.getName(), s.getSession(), s.getCgpa(), s.isPassedOut()};
				((DefaultTableModel)table.getModel()).addRow(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		contentPane.add(table);
	}

}
