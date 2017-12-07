package Pokedex;

import java.sql.SQLException;

public class TesteClass {
	public static void main(String[] args) throws SQLException {
		try {
		PokemonDAO poke = new PokemonDAO();
		Pokemon saida = poke.selecionaFromPokemonTableById(1, new Pokemon());
		System.out.println(saida.getNome());
		saida = new PokemonFraquezaDAO().selecionaFromTablePokeFraquezaByIdPokemon(saida.getId(), saida);
		System.out.println(saida.getFraquezas());
		saida = new PokemonHabilidadesDAO().selecionaFromPokeHabilidadeByIdPokemon(1, saida);
		System.out.println(saida.getHabilidades());
		saida = new PokemonTiposDAO().selecionaFromTablePokeTiposByIdPokemon(1, saida);
		System.out.println(saida.getTipos());
		saida = new PokemonSexoDAO().selecionaFromTablePokeSexoByIdPokemon(1, saida);
		System.out.println(saida.getSexo());
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}
