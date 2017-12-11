package Pokedex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CapturadosUsuarioDAO {
	
	private Connection con;
	public CapturadosUsuarioDAO() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public ResultSet selecionaPokemonFromCapturadosByUsuario(int idUsuario) throws SQLException {
		
		ResultSet rs = null;

		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select pk.id from pokemons as pk"
					+ "join capturados_usuario as cu pn cu.id_pokemon = pk.id"
					+ "join usuarios as u on cu.id_usuario = u.id where u.id = %s", idUsuario);
			rs = stmt.executeQuery(sqlStatement);
			
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			this.con.close();
		}
		
		return rs;
	}
}
