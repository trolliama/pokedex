package Pokedex;

import java.sql.*;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/pokedex", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
