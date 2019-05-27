/* ColorPanel is a JPanel that contains a rectangle.
 * The width and color of the rectangle are set when the constructor get called.
 * The SensorGUI class will set the width to sensor.getStatusValue() 
 * and color to sensor.getStatusColor()
 */

package sensorTracker;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ColorPanel extends JPanel{
	public ColorPanel(double width, Color statusColor) {
		this.width = width;
		this.statusColor = statusColor;
	}
	
	public void paint(Graphics g) {
	    g.setColor(statusColor);
	    g.fillRect(30,30,(int) width,100);
	  }
	  
	  private double width;
	  private Color statusColor;
}
