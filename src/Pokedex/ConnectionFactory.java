package Pokedex;

import java.sql.*;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/pokedex", "root", "123456");
		} catch (SQLException e) {
			System.out.println("kk");
			throw new RuntimeException(e);
		}
	}
}
