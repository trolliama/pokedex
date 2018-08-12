package gui;

import java.awt.Dimension;
import java.awt.Image;
import java.sql.SQLException;

import pokedex.Imagem;
import pokedex.ListaDePokemons;
import pokedex.Pokemon;

public class PaineisInformacoesDoUsuario extends Paineis{
	

    public PaineisInformacoesDoUsuario(String nomeAba, Dimension dimension,ListaDePokemons listaPk) {
        super(nomeAba,dimension,listaPk);
	
    }
	
    public void adicionarPokemon(Pokemon poke) throws SQLException {
        System.out.println("o");
        
        setPainelTemporarioBL(new PainelBorderLayout());
        configuraConstraint();
        
        listaOsPokemons(poke);
        acrescentaXY();
        
        addPaineis();
    }
	
    public void listaOsPokemons(Pokemon poke) throws SQLException{
    	
    	Image img = new Imagem().setNewImg(poke.getId(), 140, 140);
		
        getPainelTemporarioBL().criaBotoes(img,getListaPoke(),poke);
    }
	
	
}
