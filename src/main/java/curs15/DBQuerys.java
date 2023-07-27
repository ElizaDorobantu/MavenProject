package curs15;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.sql.Statement;

public class DBQuerys {
public static List<String> dbSelectQuery(Connection conn, String query){
	List<String> resultList = new ArrayList<String>();
	try {
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(query);
		
		while(result.next()) {
			//resultList.add(result.getString(5));}//aduce coloana 5
			resultList.add(result.getString(2));}//aduce coloana 2
	}
	catch(SQLException e) {
		System.out.println("Nu am putut executa query-ul!");
	}
	return resultList;
}

public static void dbUpdateQuery(Connection conn, String query) {
	try {
		Statement statement = conn.createStatement();
		statement.executeUpdate(query);
		System.out.println("Am facut update!");
	}
	catch (SQLException e) {
		System.out.println("Nu am putut face update!");
	}
}

public static void dbDeleteQuery(Connection conn, String query) {
	try {
		Statement statement = conn.createStatement();
		statement.executeUpdate(query);
		System.out.println("Am facut delete!");
	}
	catch (SQLException e) {
		System.out.println("Nu am putut face delete!");
	}
}
}
