package sensor;

import sensor.RadiationSensor;

public class RadiationSensorAdapter extends SensorAdapter{

	public RadiationSensorAdapter(){
		this.sensor = new RadiationSensor();
		this.type = sensor.getName();
		this.value = sensor.getRadiationValue();
		this.status = sensor.getStatusInfo();
	}

	@Override
	public int getStatusValue() {
		return (int) ((value/4) * 200);
	}
	
	private RadiationSensor sensor;

}
