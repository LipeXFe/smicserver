package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

	
	
	public static void main(String[] args) {
		Connection con = createConnection();
		
		if( con !=  null){
			
			System.out.println("conectado!");

		}
		
	}
	

	public static  Connection createConnection(){
		
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
	
}
