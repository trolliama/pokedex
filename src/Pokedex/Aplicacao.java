/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokedex;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author caio
 */
public class Aplicacao {
	
    public static void main(String args[]) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		try {
			ArrayList<Pokemon> listPokemon = new ArrayList<Pokemon>();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select id from pokemons");
			
			while(rs.next()) {
				Pokemon pokemon = new Pokemon();
				int id = rs.getInt("id");
				pokemon = new PokemonDAO().selecionaFromPokemonTableById(id, pokemon);
				pokemon = new PokemonFraquezaDAO().selecionaFromTablePokeFraquezaByIdPokemon(id, pokemon);
				pokemon = new PokemonHabilidadesDAO().selecionaFromPokeHabilidadeByIdPokemon(id, pokemon);
				pokemon = new PokemonTiposDAO().selecionaFromTablePokeTiposByIdPokemon(id, pokemon);
				pokemon = new PokemonSexoDAO().selecionaFromTablePokeSexoByIdPokemon(id, pokemon);
				
				listPokemon.add(pokemon);
			}
			for (Pokemon poke: listPokemon) {
				System.out.println(poke.getNome());
				System.out.println(poke.getFraquezas());
				System.out.println(poke.getHabilidades());
				System.out.println(poke.getTipos());
				System.out.println(poke.getSexo());
			}
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			con.close();
		}
		
        
    }
}
