package Pokedex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DesejadosUsuarioDAO {
	
	private Connection con;
	public DesejadosUsuarioDAO() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public Object[] selecionaPokemonFromCapturadosByUsuario(int idUsuario) throws SQLException {
		Object[] obj = new Object[2];
		ResultSet rs = null;

		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select pk.id from pokemons as pk"
					+ " join desejados_usuario as du on du.id_pokemon = pk.id"
					+ " join usuarios as u on du.id_usuario = u.id where u.id = %s", idUsuario);
			rs = stmt.executeQuery(sqlStatement);
			
		}catch(SQLException e) {
			System.out.println(e);
		}

		obj[0] = rs;
		obj[1] = this.con;
		
		return obj;
	}
}
