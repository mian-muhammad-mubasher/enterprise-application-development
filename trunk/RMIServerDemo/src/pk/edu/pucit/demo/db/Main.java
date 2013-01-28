package pk.edu.pucit.demo.db;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

	/**
	 * @param args
	 * @throws RemoteException 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		// TODO Auto-generated method stub
		RemoteDataAccessManager rdam = new DataAccessManager();
	    Registry registry = LocateRegistry.getRegistry();
	    registry.rebind("remoteDataAccessManager", rdam);
		System.out.println("Server is running...");
	}

}
