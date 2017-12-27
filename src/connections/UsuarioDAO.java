package connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO {
	
	private Connection con;
	
	public UsuarioDAO() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public Object[] selecionaFromUsuarioByLogin(String login) throws SQLException {
		Object[] ob = new Object[2];
		
		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select id,senha from usuarios where login='%s'", login);
			ResultSet rs = stmt.executeQuery(sqlStatement);
			
			while(rs.next()) {
				ob[0] = rs.getString("senha");
				ob[1] = rs.getInt("id");
			}
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			this.con.close();
		}
		
		return ob;
	}
	
	public void cadastraUsuario(String login, String senha, String nome, String sobrenome, String email) throws SQLException {
		
		try {
			String sqlStatement = "insert into usuarios values(default,?,?,?,?,?)";
			PreparedStatement stmt = this.con.prepareStatement(sqlStatement);
			
			stmt.setString(1,login);
			stmt.setString(2, senha);
			stmt.setString(3, nome);
			stmt.setString(4, sobrenome);
			stmt.setString(5, email);
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			this.con.close();
		}
	}
}
