package Pokedex;
import java.sql.*;

public class PokemonDAO {
	
	private Connection con;
	public PokemonDAO() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public Pokemon selecionaFromPokemonTableById(int id, Pokemon pokemon) throws SQLException {
		
		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select * from pokemon where id = %d", id);
			ResultSet rs = stmt.executeQuery(sqlStatement);
			while(rs.next()) {
				pokemon.setId(rs.getInt("id"));
				pokemon.setNome(rs.getString("nome"));
				pokemon.setVida(rs.getInt("vida"));
				pokemon.setAtaque(rs.getInt("ataque"));
				pokemon.setDefesa(rs.getInt("defesa"));
				pokemon.setAtaqueSp(rs.getInt("ataqueSp"));
				pokemon.setDefesaSp(rs.getInt("defesaSp"));
				pokemon.setIdEvolucao(rs.getInt("id_evolucao"));
				pokemon.setDescricao(rs.getString("descricao"));
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
