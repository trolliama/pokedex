package connections;
import java.sql.*;

import pokedex.Pokemon;

public class PokemonSexoDAO {
	private Connection con = new ConnectionFactory().getConnection();
	
	public Pokemon selecionaFromTablePokeSexoByIdPokemon(int id, Pokemon pokemon) throws SQLException {
		
		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select s.sexo from pokemons as pk "
					+ "join pokemon_sexos as pks on pk.id = pks.id_pokemon "
					+ "join sexos as s on s.id = pks.id_sexo where pk.id = %d", id);
			
			ResultSet rs = stmt.executeQuery(sqlStatement);
			
			while(rs.next()) {
				pokemon.setSexo(rs.getString("s.sexo"));
			}
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			this.con.close();
		}
		
		return pokemon;
	}
}
