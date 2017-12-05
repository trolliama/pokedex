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
			String sqlStatement = String.format("select id_tipo from pokemon_fraquezas where id_pokemon = %d", id);
			ResultSet rs = stmt.executeQuery(sqlStatement);
			while(rs.next()) {
				pokemon.setFraquezas(new TiposDAO().selecionaFromTiposById(rs.getInt("id_tipo")));
		
			}
			return pokemon;
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		finally {
			this.con.close();
		}
		return pokemon;
	}
}
