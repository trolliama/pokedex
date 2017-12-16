package Pokedex;

import java.awt.Dimension;
import java.sql.SQLException;

public class PainelTabCapturadosPokemons extends PaineisTelaInicial{
	private ListaDePokemons pkLista;

	public PainelTabCapturadosPokemons(Dimension dimension,int idUsuario) throws SQLException {
		super(dimension, idUsuario);
		System.out.println("cheguei");
		pkLista = new ListaDePokemons(new CapturadosUsuarioDAO().selecionaPokemonFromCapturadosByUsuario(idUsuario));
		System.out.println("não cheguei");
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
