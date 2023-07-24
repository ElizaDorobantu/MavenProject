package curs15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection openDBConnection (String url, String user, String pass) {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(null, null, null);
			System.out.println("Conexiune cu succes!");
		}
		catch (SQLException e) {
			System.out.println("Nu am putut face conexiunea!");
		}
		return conn;
	}
	
	public static void closeDBConnection(Connection conn) {
		try {
			conn.close();
			System.out.println("Conexiunea a fost inchisa!");
		}
		catch(SQLException e){
			System.out.println("Nu am putut inchide conexiunea!");
		}
	}
}
