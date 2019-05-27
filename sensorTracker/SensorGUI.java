package sensorTracker;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import sensor.PressureSensorAdapter;
import sensor.RadiationSensorAdapter;
import sensor.Sensor;
import sensor.TemperatureSensorAdapter;

public class SensorGUI extends JFrame {
	
	public SensorGUI() {
		setTitle("Sensor Tracker");
		setLayout(new GridLayout(3,1));
	
		//Add sensors that will be used
		ArrayList<Sensor> sensors = new ArrayList<Sensor>();
		sensors.add(new TemperatureSensorAdapter());
		sensors.add(new PressureSensorAdapter());
		sensors.add(new RadiationSensorAdapter());
		setLayout(new GridLayout(sensors.size(),1));
		
		//Iterate through each sensor and create a panel of each one
		for(Sensor sensor : sensors) {
			JPanel sensorPanel = new JPanel();
			ColorPanel colorStatusPanel = new ColorPanel(sensor.getStatusValue(),sensor.getStatusColor());
			JLabel statusLabel = new JLabel(sensor.getStatusInfo());
			sensorPanel.setLayout(new GridLayout(2,1));
			sensorPanel.add(colorStatusPanel);
			sensorPanel.add(statusLabel);
			sensorPanel.setBorder(new TitledBorder(sensor.getType()));
			add(sensorPanel);
		}
				
		setPreferredSize(new Dimension(600,600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
}
