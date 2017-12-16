package Pokedex;

import java.awt.Dimension;
import java.sql.SQLException;


public class PainelTabFavoritosPokemons extends PaineisTelaInicial{
	
	private ListaDePokemons pkLista;

	public PainelTabFavoritosPokemons(Dimension dimension,int idUsuario) throws SQLException {
		super(dimension, idUsuario);
		
		this.pkLista = new ListaDePokemons(new FavoritosUsuarioDAO().selecionaPokemonFromFavoritosByUsuario(idUsuario));
		
		chamaListarPokemons();
	}
	
	public void chamaListarPokemons() throws SQLException {
		for(int i=0;i<50;i++) {
	    	for(Pokemon poke: pkLista.getLista()) {
	    		listaOsPokemons(poke);
	    	}
		}
	}

}
