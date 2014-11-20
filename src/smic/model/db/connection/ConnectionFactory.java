package smic.model.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection createConnection(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ocsweb?" + "user=root&password=root");

			return con;
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println(" não conectado!");

		return null;
		
	}
	
	public void closeConnection(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}

