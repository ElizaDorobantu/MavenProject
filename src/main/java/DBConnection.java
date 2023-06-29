import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection openDBConnection(String url, String user, String pass) {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url,user,pass);
			System.out.println("Conexiune cu succes");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Nu am putut face conexiunea");
		}
		//se ocupa de conexiunea cu baza de date
		return conn;
		
	}
	
	//static da aceeasi valoare unde e folosita metoda, variabila, obiectul ....
}
