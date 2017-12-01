package Pokedex;
import java.sql.*;

public class PokemonDAO {
	
	private Connection con;
	
	public PokemonDAO() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public Pokemon[] selecionaAll() {
		try {
			PreparedStatement stmt = this.con.prepareStatement("select * from pokemon");
			ResultSet result = stmt.executeQuery();
			
			while(result.next()) {
				Pokemon pokemon = new Pokemon();
				pokemon.setId(result.getInt("id"));
				pokemon.setNome(result.getString("nome"));
				pokemon.setTipo(result.getString("tipo"));
				pokemon.setVida(result.getInt("vida"));
				pokemon.setAtaque(result.getInt("ataque"));
				pokemon.setDefesa(result.getInt("defesa"));
				pokemon.set
			}
		}
	}
}
