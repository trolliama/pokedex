package Pokedex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO {
	
	private Connection con = new ConnectionFactory().getConnection();
	
	public String selecionaFromUsuarioByLogin(String login) throws SQLException {
		String senha = "";
		
		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select senha from usuarios where login=%s", login);
			ResultSet rs = stmt.executeQuery(sqlStatement);
			
			while(rs.next()) {
				senha = rs.getString("senha");
			}
		}catch(SQLException e) {
			System.out.println(e);
			return senha;
		}finally {
			this.con.close();
		}
		
		return senha;
	}
}
