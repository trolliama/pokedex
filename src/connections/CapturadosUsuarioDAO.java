package connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CapturadosUsuarioDAO {
	
	private Connection con;
	public CapturadosUsuarioDAO() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public Object[] selecionaPokemonFromCapturadosByUsuario(int idUsuario) throws SQLException {
		Object[] obj = new Object[2];
		ResultSet rs = null;

		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select pk.id from pokemons as pk"
					+ " join capturados_usuario as cu on cu.id_pokemon = pk.id"
					+ " join usuarios as u on cu.id_usuario = u.id where u.id = %s", idUsuario);
			rs = stmt.executeQuery(sqlStatement);
			
		}catch(SQLException e) {
			System.out.println(e);
		}

		obj[0] = rs;
		obj[1] = this.con;
		
		return obj;
	}
	
	public boolean selecionaPokemonFromCapturadosByUserAndPoke(int idUsuario, int idPoke) throws SQLException {
		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select pk.id from pokemons as pk"
					+ " join capturados_usuario as cu on cu.id_pokemon = pk.id"
					+ " join usuarios as u on cu.id_usuario = u.id where u.id = %d and pk.id= %s", idUsuario, idPoke);
			
			ResultSet rs = stmt.executeQuery(sqlStatement);
			if(rs.next()) {
				return true;
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			this.con.close();
		}
		return false;
	}
	
	public void inseriPokemonEmCapturados(int idPoke, int idUsuario) throws SQLException {
		try {
			String sqlStatement = "insert into capturados_usuario values(default,?,?)";
			PreparedStatement stmt = this.con.prepareStatement(sqlStatement);
			
			stmt.setInt(1,idPoke);
			stmt.setInt(2, idUsuario);
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			this.con.close();
		}
	}
	
	public void retiraPokemonEmCapturados(int idPoke, int idUsuario) throws SQLException {
		try {
			String sqlStatement = String.format("delete from capturados_usuario where id_pokemon = %d and id_usuario = %d", idPoke, idUsuario);
			PreparedStatement stmt = this.con.prepareStatement(sqlStatement);
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			this.con.close();
		}
	}
}
