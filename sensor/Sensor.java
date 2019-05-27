package sensor;

import java.awt.Color;

public interface Sensor {
	//Returns sensor type
	public abstract String getType();
	
	//Returns int value used to determine length of ColorPanel
	public abstract int getStatusValue();
	
	//Returns Color used to determine color of ColorPanel
	public abstract Color getStatusColor();
	
	//Returns status-->value
	public abstract String getStatusInfo();
}
