package connections;

import java.sql.*;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/pokedex?autoReconnect=true&useSSL=false","root","cdc121022");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
