package swing.clock.digital;

import java.awt.Font;
import java.util.Calendar;

import javax.swing.JLabel;

public class DigitalClock implements Runnable {

	private Thread thread = null;
	private int hours = 0;
	private int minutes = 0;
	private int seconds = 0;
	private String timeString = "";
	
	private JLabel timeLabel = null;
	
	public DigitalClock() {
		timeLabel = new JLabel(timeString);
		timeLabel.setFont(new Font("Arial", Font.BOLD ,20));
		thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Calendar calendar = Calendar.getInstance();
				hours = calendar.get(Calendar.HOUR_OF_DAY);
				minutes = calendar.get(Calendar.MINUTE);
				seconds = calendar.get(Calendar.SECOND);
			}
		} catch (Exception e) {

		}
	}

	public JLabel getTimeLabel() {
		return timeLabel;
	}
	
}
