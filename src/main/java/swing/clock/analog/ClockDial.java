package swing.clock.analog;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.time.Clock;

import javax.swing.JPanel;

public class ClockDial extends JPanel {

	AnalogClock parent;
	
	public ClockDial(AnalogClock pt) {
		setSize(520, 530);
		parent = pt;
		
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0,  0, getWidth(), getHeight());
		g.setColor(Color.WHITE);
		g.fillOval(5, 5, 480, 480);
		g.setColor(Color.BLUE);
		g.fillOval(10, 10, 470, 470);
		g.setColor(Color.WHITE);
		g.fillOval(237, 237, 15, 15);
		g.setFont(g.getFont().deriveFont(Font.BOLD,32));
		
		for (int i = 1; i <= 12; i++) {
			g.drawString(Integer.toString(i), 240 - (i / 12) * 11 + (int)(210 * Math.sin((i * Math.PI / 6))), 253 - (int)(210 * Math.cos(i * Math.PI / 6)));
			double minsecdeg = (double) Math.PI / 30;
			double hrdeg = (double) Math.PI / 6;
			int tx, ty;
			int xpoints[] = new int[3];
			int ypoints[] = new int[3];
			
			// second hand
			tx = 245 + (int) (210 * Math.sin(parent.getSeconds() * minsecdeg));
			ty = 245 - (int) (210 * Math.cos(parent.getSeconds() * minsecdeg));
			g.drawLine(245, 245, tx, ty);
			// minute hand
			tx = 245 + (int) (190 * Math.sin(parent.getMinutes() * minsecdeg));
			ty = 245 - (int) (190 * Math.cos(parent.getMinutes() * minsecdeg));
			xpoints[0] = 245;
			xpoints[1] = tx + 2;
			xpoints[2] = tx - 2;
			ypoints[0] = 245;
			ypoints[1] = ty + 2;
			ypoints[2] = ty - 2;
			g.fillPolygon(xpoints, ypoints, 3);
			// hour hand
			tx = 245 + (int) (160 * Math.sin(parent.getHour() * hrdeg + parent.getMinutes() * Math.PI / 360));
			ty = 245 - (int) (160 * Math.cos(parent.getHour() * hrdeg + parent.getMinutes() * Math.PI / 360));
			
			xpoints[1] = tx + 4;
			xpoints[2] = tx - 4;
			
			ypoints[1] = ty + 4;
			ypoints[2] = ty - 4;
			
			g.fillPolygon(xpoints, ypoints, 3);
		}
	}
	
}
