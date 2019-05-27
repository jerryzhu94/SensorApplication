package sensor;

import sensor.PressureSensor;

public class PressureSensorAdapter extends SensorAdapter{

	public PressureSensorAdapter(){
		this.sensor = new PressureSensor();
		this.type = sensor.getSensorName();
		this.value = sensor.readValue();
		this.status = sensor.getReport();
	}

	@Override
	public int getStatusValue() {
		return (int) ((value/6.58) * 200);
	}
	
	private PressureSensor sensor;

}
