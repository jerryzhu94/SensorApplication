package sensor;

import sensor.TemperatureSensor;

public class TemperatureSensorAdapter extends SensorAdapter{

	public TemperatureSensorAdapter(){
		this.sensor = new TemperatureSensor();
		this.type = sensor.getSensorType();
		this.value = sensor.senseTemperature();
		this.status = sensor.getTempReport();
	}
	
	@Override
	public int getStatusValue() {
		return (int) ((value/300) * 200);
	}
	
	private TemperatureSensor sensor;

}
