package Pokedex;
import java.sql.*;

public class PokemonDAO {
	
	private Connection con;
	public PokemonDAO() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public Pokemon selecionaAllFromPokemonTable() throws SQLException {
		Pokemon pokemon = new Pokemon();
		
		try {
			PreparedStatement stmt = this.con.prepareStatement("select * from pokemon");
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				pokemon.setId(result.getInt("id"));
				pokemon.setNome(result.getString("nome"));
				pokemon.setVida(result.getInt("vida"));
				pokemon.setAtaque(result.getInt("ataque"));
				pokemon.setDefesa(result.getInt("defesa"));
				pokemon.setAtaqueSp(result.getInt("ataqueSp"));
				pokemon.setDefesaSp(result.getInt("defesaSp"));
				pokemon.setIdEvolucao(result.getInt("id_evolucao"));
				pokemon.setDescricao(result.getString("descricao"));
			}
		}catch(SQLException e){
			System.out.println(e);
		}
		finally {
			this.con.close();
		}
		return pokemon;
	}
}
