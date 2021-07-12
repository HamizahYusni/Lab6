import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;


/**
 * This class manage the value of temperature from the sensor.
 * 
 * @author emalianakasmuri
 *
 */
public class TemperatureSensorManager extends UnicastRemoteObject implements TemperatureSensor {

	public TemperatureSensorManager() throws RemoteException {
		super();
	}

	@Override
	public int getTemperature() throws RemoteException {
		
		return 35;
	}

	private HashMap<String , Integer> loadTemperatureData()
	{
		HashMap<String , Integer> temperature = new HashMap<>();	
		
		// put value into hash map
		temperature.put("Monday", 32);
		temperature.put("Tuesday", 31);
		temperature.put("Wednesday", 33);
		temperature.put("Thursday", 35);
		temperature.put("Friday", 36);
		temperature.put("Saturday", 33);
		temperature.put("Sunday", 33);
		
		return temperature;
	}
	
	@Override
	public int getTemperatureByDay(String day) throws RemoteException {
		// TODO Auto-generated method stub
		HashMap <String, Integer> temp = loadTemperatureData();
		
		int temperature = temp.get(day);
		
		return temperature;
	}

	@Override
	public float getAverageTemperature() throws RemoteException {
		
		HashMap <String, Integer> temp = loadTemperatureData();
		
		int totalTemperature = 0;
		for (int temperature : temp.values())
		{
			totalTemperature += temperature;
		}
		
		float averageTemperature = (float)totalTemperature/temp.size();
		
		
		return averageTemperature;
	}
	
}
