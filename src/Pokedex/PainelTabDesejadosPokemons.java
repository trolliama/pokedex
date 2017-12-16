package Pokedex;

import java.awt.Dimension;
import java.sql.SQLException;


public class PainelTabDesejadosPokemons extends PaineisTelaInicial{
	
	private ListaDePokemons pkLista;

	public PainelTabDesejadosPokemons(Dimension dimension,int idUsuario) throws SQLException {
		super(dimension, idUsuario);
		
		pkLista = new ListaDePokemons(new DesejadosUsuarioDAO().selecionaPokemonFromCapturadosByUsuario(idUsuario));
		
		chamalistarPokemons();
	}
	
	public void chamalistarPokemons() throws SQLException{
    	
		for(int i=0;i<50;i++) {
	    	for(Pokemon poke: pkLista.getLista()) {
	    		listaOsPokemons(poke);
	    	}
		}
    }
}
