package Pokedex;

import java.sql.*;

public class PokemonFraquezaDAO {
	
	private Connection con;
	public PokemonFraquezaDAO() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public Pokemon selecionaFromTablePokeFraquezaByIdPokemon(int id, Pokemon pokemon) throws SQLException {
		
		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select tp.tipo from pokemons as pk"+
							" join pokemon_fraquezas as pf on pf.id_pokemon=pk.id "+""
							+ "join tipos as tp on tp.id=pf.id_tipo where pk.id = %d", id);
			
			ResultSet rs = stmt.executeQuery(sqlStatement);
			while(rs.next()) {
				pokemon.setFraquezas(rs.getString("tp.tipo"));
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
