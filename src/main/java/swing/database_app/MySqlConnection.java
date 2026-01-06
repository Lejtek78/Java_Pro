package swing.database_app;

import java.sql.*;
import javax.swing.*;

public class MySqlConnection {

	Connection conn = null;
	
	public static Connection connectDB() {
		
		try {
			
			// Loading the driver
			Class.forName("com.jdbc.mysql.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "");
			
			JOptionPane.showMessageDialog(null, "Connection successful");
			
			return conn;
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		
	}
	
	
}
