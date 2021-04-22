package ftmk.rmi.sensor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;



public interface TemperatureSensor extends Remote {
	
	
	
	
	/**
	 * This method gets current temperature
	 * 
	 * @return current temperature
	 * 
	 * @throws RemoteException
	 */
	public int getTemperature() throws RemoteException;
	
	public HashMap<String, Integer> getTemperatureDays() throws RemoteException;
	
	public float getAverageTemperature() throws RemoteException;
	

}

