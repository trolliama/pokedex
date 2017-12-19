package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import connections.CapturadosUsuarioDAO;
import connections.DesejadosUsuarioDAO;
import connections.FavoritosUsuarioDAO;
import pokedex.ListaDePokemons;
import pokedex.Pokemon;

public class Abas extends JTabbedPane{
	private ListaDePokemons pkLista;
	private int idUsuario;
	private Dimension dimension;
	private ArrayList<PaineisTelaInicial> paineis;
	private GridBagConstraints c;
	
	public Abas(int idUsuario, Dimension dim,ListaDePokemons lista, ArrayList<PaineisTelaInicial> paineis) throws SQLException {
		this.idUsuario = idUsuario;
		this.dimension = dim;
		this.paineis = paineis;
		this.pkLista = lista;
		
		criaAbas();
		addOnTabPane();
		
	}
	

    
    public void atualizaFrame(Pokemon poke, GridBagConstraints c, JPanel comp) throws SQLException {
    	
    	paineis.get(0).atualizar(poke, poke.getId()-1,comp,c, this);
    	
    	this.repaint();
    }

	public void criaAbas() throws SQLException {
    	this.c = new GridBagConstraints();
    	
    	this.c.weightx = 1;
    	this.c.weighty = 1;
    	
    	this.c.fill = GridBagConstraints.BOTH;
    	
    	JPanel stretch = new JPanel();
    	for(Pokemon poke: pkLista.getLista()) {
    		

    		paineis.get(0).configuraConstraint();
    		paineis.get(0).listaOsPokemons(poke, this.idUsuario, this);
    		paineis.get(0).addPaineis();
    		
    		Adicionar(poke);
    	}
    	
    	double width = this.dimension.getWidth()/168;
    	
    	for(PaineisTelaInicial painel: paineis) {
	    	
    		if (painel.getComponentCount() < width) {
	    		painel.add(stretch, this.c);
    		}
    	}
    }
    
    public void Adicionar(Pokemon poke) throws SQLException {
    	
    	if(new DesejadosUsuarioDAO().selecionaPokemonFromDesejadosByUserAndPoke(this.idUsuario, poke.getId())) {
    		paineis.get(1).configuraConstraint();
    		paineis.get(1).listaOsPokemons(poke, this.idUsuario, this);
    		paineis.get(1).addPaineis();
    	}
		if(new FavoritosUsuarioDAO().selecionaPokemonFromFavoritosByUserAndPoke(this.idUsuario, poke.getId())) {
			paineis.get(2).configuraConstraint();
			paineis.get(2).listaOsPokemons(poke, this.idUsuario, this);
			paineis.get(2).addPaineis();
    	}
		if(new CapturadosUsuarioDAO().selecionaPokemonFromCapturadosByUserAndPoke(this.idUsuario, poke.getId())) {
			paineis.get(3).configuraConstraint();
			paineis.get(3).listaOsPokemons(poke, this.idUsuario, this);
			paineis.get(3).addPaineis();
    	}
    }
    
    public void addOnTabPane() {
    	
    	addTab("Pokemons", paineis.get(0).criaScrollPane());
    	add("Desejados", paineis.get(1).criaScrollPane());
    	add("Favoritos", paineis.get(2).criaScrollPane());
    	add("Capturados", paineis.get(3).criaScrollPane());
    	
    }
}
