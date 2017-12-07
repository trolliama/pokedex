package Pokedex;

import java.sql.*;

public class PokemonHabilidadesDAO {
	
	private Connection con;
	public PokemonHabilidadesDAO() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public Pokemon selecionaFromPokeHabilidadeByIdPokemon(int id, Pokemon pokemon) throws SQLException {
		
		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select hb.nome_habilidade from habilidades as hb "+
						"join pokemon_habilidades as pk_hb on hb.id = pk_hb.id_habilidade "+
						"join pokemons as pk on pk.id = pk_hb.id_pokemon where pk.id = %d", id);

			ResultSet rs = stmt.executeQuery(sqlStatement);
			
			while (rs.next()) {
				pokemon.setHabilidades(rs.getString("hb.nome_habilidade"));
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			this.con.close();
		}
		
		return pokemon;
	}
	
}
