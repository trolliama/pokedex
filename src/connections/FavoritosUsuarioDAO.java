package connections;

	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

public class FavoritosUsuarioDAO {
	
	private Connection con;
	public FavoritosUsuarioDAO() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public Object[] selecionaPokemonFromFavoritosByUsuario(int idUsuario) throws SQLException {
		Object[] obj = new Object[2];
		ResultSet rs = null;

		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select pk.id from pokemons as pk"
					+ " join favoritos_usuario as fu on fu.id_pokemon = pk.id"
					+ " join usuarios as u on fu.id_usuario = u.id where u.id = %d", idUsuario);
			
			rs = stmt.executeQuery(sqlStatement);
			
		}catch(SQLException e) {
			System.out.println(e);
		}

		obj[0] = rs;
		obj[1] = this.con;
		
		return obj;
	}
	
	public boolean selecionaPokemonFromFavoritosByUserAndPoke(int idUsuario, int idPoke) throws SQLException {
		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select pk.id from pokemons as pk"
					+ " join favoritos_usuario as fu on fu.id_pokemon = pk.id"
					+ " join usuarios as u on fu.id_usuario = u.id where u.id = %d and pk.id= %s", idUsuario, idPoke);
			
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
	
	public void inseriPokemonEmFavoritos(int idPoke, int idUsuario) throws SQLException {
		try {
			String sqlStatement = "insert into favoritos_usuario values(default,?,?)";
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
	
	public void retiraPokemonEmFavoritos(int idPoke, int idUsuario) throws SQLException {
		try {
			String sqlStatement = String.format("delete from favoritos_usuario where id_pokemon = %d and id_usuario = %d", idPoke, idUsuario);
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


