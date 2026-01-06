package swing.clock.analog;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.JFrame;

public class AnalogClock extends JFrame {

	private int hour;
	private int minutes;
	private int seconds;
	ClockDial cd;
	
	public AnalogClock() {
		setSize(510, 530);
		
		setTitle("My Own Clock");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cd = new ClockDial(this);
		getContentPane().add(cd);
		LocalTime localTime = LocalTime.now(Clock.system(ZoneId.of("America/New_York")));
		String time = localTime.toString();
		System.out.println(time);
		hour = localTime.getHour();
		System.out.println(hour);
		minutes = localTime.getMinute();
		System.out.println(minutes);
		seconds = localTime.getSecond();
		System.out.println(seconds);
		ClockEngine.setPriority(ClockEngine.getPriority()+3);
		ClockEngine.start();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AnalogClock().setVisible(true);;
	}
	
	Thread ClockEngine = new Thread() {
		int newsec, newmin;
		
		public void run() {
			while(true) {
				newsec = (seconds + 1) % 60;
				newmin = (minutes + (seconds + 1) / 60) % 60;
				hour = (hour + (minutes + (seconds + 1) / 60) / 60) % 12;
				seconds = newsec;
				minutes = newmin;
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					
				}
				
				cd.repaint();
			}
		}
	};

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getHour() {
		return hour;
	}

	public int getMinutes() {
		return minutes;
	}
	
	
	
}
