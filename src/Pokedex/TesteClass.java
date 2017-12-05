package Pokedex;

import java.sql.SQLException;

public class TesteClass {
	public static void main(String[] args) throws SQLException {
		try {
		PokemonDAO poke = new PokemonDAO();
		Pokemon saida = poke.selecionaFromPokemonTableById(1, new Pokemon());
		System.out.println(saida.getNome());
		String tp = new TiposDAO().selecionaFromTiposById(1);
		System.out.println(tp);
		String hb = new HabilidadesDAO().selecionaFromHabilidadesById(1);
		System.out.println(hb);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}
