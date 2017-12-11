package Pokedex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ListaDePokemons{
	
	private ArrayList<Pokemon> listPokemon;
	
	public ListaDePokemons(ResultSet rs) throws SQLException {
		this.listPokemon = new ArrayList<Pokemon>();
		
		try {
			
			while(rs.next()) {
				Pokemon pokemon = new Pokemon();
				int id = rs.getInt("id");
				pokemon = new PokemonDAO().selecionaFromPokemonTableById(id, pokemon);
				pokemon = new PokemonFraquezaDAO().selecionaFromTablePokeFraquezaByIdPokemon(id, pokemon);
				pokemon = new PokemonHabilidadesDAO().selecionaFromPokeHabilidadeByIdPokemon(id, pokemon);
				pokemon = new PokemonTiposDAO().selecionaFromTablePokeTiposByIdPokemon(id, pokemon);
				pokemon = new PokemonSexoDAO().selecionaFromTablePokeSexoByIdPokemon(id, pokemon);
				
				setLista(pokemon);
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	}
	
	public ArrayList<Pokemon> getLista(){
		return this.listPokemon;
	}
	
	public void setLista(Pokemon poke) {
		this.listPokemon.add(poke);
	}
}
