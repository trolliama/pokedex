package Pokedex;

import java.awt.Dimension;
import java.sql.SQLException;


public class PainelTabAllPokemos extends PaineisTelaInicial{
	
	private ListaDePokemons pkLista;

	public PainelTabAllPokemos(Dimension dimension, int idUsuario) throws SQLException {
		super(dimension, idUsuario);
		
		this.pkLista = new ListaDePokemons(new PokemonDAO().selecionaAllPokemons());
		
		chamalistarPokemons();
	}
	
	public void chamalistarPokemons() throws SQLException{
		for(int i=0;i<50;i++) {
	    	for(Pokemon poke: pkLista.getLista().subList(0, 3)) {
	    		listaOsPokemons(poke);
	    		
	    	}
		}
    }
}
