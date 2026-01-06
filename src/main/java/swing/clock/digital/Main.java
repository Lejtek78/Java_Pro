package swing.clock.digital;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setTitle("Clock");
		
		DigitalClock digitalClock = new DigitalClock();
		
		frame.add(digitalClock.getTimeLabel());
		
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}
