package pk.edu.pucit.demo.db;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;


public interface RemoteDataAccessManager extends Remote {
	public void saveStudent(Student s) throws RemoteException, SQLException;
	public Student getStudent(String rollNumber) throws RemoteException, SQLException;
	public String[] getAllRollNumber() throws RemoteException, SQLException;
}
