package Pokedex;

import java.sql.SQLException;

public class TesteClass {
	public static void main(String[] args) throws SQLException {
		try {
		PokemonDAO poke = new PokemonDAO();
		Pokemon saida = poke.selecionaAllFromPokemonTable();
		System.out.println(saida.getId());
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}
