package curs15;

import java.sql.Connection;

public class TestDB {
	static String URL = "jdbc:mysql://keytraining-demo.c050jeowbe1q.eu-central-1.rds.amazonaws.com:3306/KeyTraining";
	static String USER = "demouser";
	static String PASS = "demouser";

	public static void main(String[] args) {
		//Obiect de tip DB connection
		//baza de date bazata pe credentialele de mai sus
		Connection conn =DBConnection.openDBConnection(URL, USER, PASS);
		//Query
		String selectQuery = "select * from customers;";
		//metoda care primeste obiectul de tip conexiune si query-ul
		//executa quer-ul pe conexiunea primita
		System.out.println(DBQuerys.dbSelectQuery(conn, selectQuery));
		//inchidem obiectul de tip connection
		DBConnection.closeDBConnection(conn);
	}
}
