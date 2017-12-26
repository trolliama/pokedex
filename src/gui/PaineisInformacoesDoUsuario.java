package gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.sql.SQLException;

import javax.swing.JPanel;

import pokedex.Imagem;
import pokedex.Pokemon;

public class PaineisInformacoesDoUsuario extends Paineis{
	

    public PaineisInformacoesDoUsuario(Dimension dimension) {
        super(dimension);
	
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
		
        getPainelTemporarioBL().criaBotoes(img, poke);
    }
	
	
}
