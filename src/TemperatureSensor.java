import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This interface represents temperature sensor
 * 
 * @author emalianakasmuri
 *
 */
public interface TemperatureSensor extends Remote {
	
	/**
	 * This method gets current temperature
	 * 
	 * @return current temperature
	 * 
	 * @throws RemoteException
	 */
	public int getTemperature() throws RemoteException;

	/**
	 * This method retrieve a temperature for a specified day.
	 * 
	 * @return current temperature
	 * 
	 * @param day
	 * 
	 * @throws RemoteException
	 */
	public int getTemperatureByDay(String day)throws RemoteException;

	/**
	 * This method computes average temperature.
	 * 
	 * @return average temperature
	 * 
	 * @throws RemoteException
	 */
	public float getAverageTemperature() throws RemoteException;
}
