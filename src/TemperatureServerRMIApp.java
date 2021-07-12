import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * This class represent the server-side application using RMI
 * 
 * @author emalianakasmuri
 *
 */
public class TemperatureServerRMIApp {

	public static void main(String[] args) {
		
		
		try {
			int portNo = 1803;
			
			// Create interface object
			TemperatureSensor sensorJasin = new TemperatureSensorManager();
			
			// Create registry, port 1803
			Registry rmiRegistry = LocateRegistry.createRegistry(portNo);
			
			// Register interface object as remote object
			rmiRegistry.rebind("SensorJasin", sensorJasin);
			
			System.out.println("SensorJasin is successfully registered");
			
			// Create new interface object
			TemperatureSensor sensorAyerKeroh = new TemperatureSensorManager();
						
			// Register new interface object as remote object
			rmiRegistry.rebind("SensorAyerKeroh", sensorAyerKeroh);
						
			System.out.println("Sensor Ayer Keroh is successfully registered");
						
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
