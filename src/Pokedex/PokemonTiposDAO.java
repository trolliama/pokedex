package Pokedex;

import java.sql.*;

public class PokemonTiposDAO {
	private Connection con;
	public PokemonTiposDAO() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public Pokemon selecionaFromTablePokeTiposByIdPokemon(int id, Pokemon pokemon) throws SQLException {
		
		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select tp.tipo from pokemons as pk "
					+ "join pokemon_tipos as pk_tp on pk_tp.id_pokemon = pk.id "
					+ "join tipos as tp on tp.id = pk_tp.id_tipo where id_pokemon = %d", id);
			
			ResultSet rs = stmt.executeQuery(sqlStatement);
			while(rs.next()) {
				pokemon.setTipos(rs.getString("tp.tipo"));
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		finally {
			this.con.close();
		}
		return pokemon;
	}
}
