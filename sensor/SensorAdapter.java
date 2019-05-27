/* SensorAdapter is an abstract class that contains all the fields and methods shared 
 * by all of its derived classes: TemperatureSensorAdapter, PressureSensorAdapter, RadiationSensorAdapter.
 */

package sensor;

import java.awt.Color;

public abstract class SensorAdapter implements Sensor{

	@Override
	public String getType() {
		return type;
	}
	
	@Override
	public Color getStatusColor() {
		if(status == "OK")
			return Color.GREEN;
		else if(status == "CRITICAL")
			return Color.YELLOW;
		else
			return Color.RED;
	}
	
	@Override
	public String getStatusInfo() {
		return status + "-->" + value;
	}
	
	protected String type;
	protected String status;
	protected double value;
}
