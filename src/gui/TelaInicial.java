/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import pokedex.ListaDePokemons;
import pokedex.Pokemon;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;

import connections.CapturadosUsuarioDAO;
import connections.DesejadosUsuarioDAO;
import connections.FavoritosUsuarioDAO;
import connections.PokemonDAO;

/**
 *
 * @author caio
 */
@SuppressWarnings("serial")
public class TelaInicial extends JFrame{
    
	private Dimension dimension;
	private int idUsuario = 1;
	private JTabbedPane jtp;
	private ListaDePokemons pkLista;
	private ArrayList<PaineisTelaInicial> paineis = new ArrayList<PaineisTelaInicial>();
	private GridBagConstraints c;
	
    public TelaInicial() throws SQLException{
        super("Pokédex");
        
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setSizeJFrame();
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new BorderLayout());
        
    	this.jtp = new JTabbedPane();
        add(this.jtp,BorderLayout.NORTH);
        
        criaLista();
        criaPaineis();
        criaAbas();
        addOnTabPane();
        
        setVisible(true);
    }
    
    public void atualizaFrame(Pokemon poke, GridBagConstraints c, JPanel comp) throws SQLException {
    	
    	paineis.get(0).atualizar(poke, poke.getId()-1, idUsuario, c, comp, this);

    	this.repaint();
    }
    
    public void setSizeJFrame() {
    	DisplayMode tamanho = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
    	int width = (int) (tamanho.getWidth()/1.7);
    	int height = (int) (tamanho.getHeight()/1.1);
    	this.dimension = new Dimension(width, height);
    	
    	this.setSize(this.dimension);
    }
    
    
    public void criaLista() throws SQLException {
    	this.pkLista = new ListaDePokemons(new PokemonDAO().selecionaAllPokemons());
    }
    
    public void criaPaineis() {

    	for(int i =0; i<4; i++) {
    		this.paineis.add(new PaineisTelaInicial( this.dimension ,this.idUsuario));
    		}
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
    	boolean [] bools = {new DesejadosUsuarioDAO().selecionaPokemonFromDesejadosByUserAndPoke(this.idUsuario, poke.getId()),
    			new FavoritosUsuarioDAO().selecionaPokemonFromFavoritosByUserAndPoke(this.idUsuario, poke.getId()),
    			new CapturadosUsuarioDAO().selecionaPokemonFromCapturadosByUserAndPoke(this.idUsuario, poke.getId())};
    	
    	for(int i=0;i<3;i++) {
    		if(bools[i]) {
    			paineis.get(i+1).configuraConstraint();
        		paineis.get(i+1).listaOsPokemons(poke, this.idUsuario, this);
        		paineis.get(i+1).addPaineis();
    		}
    	}
    }
    
    public void addOnTabPane() {
    	String[] listaStr= {"Pokemons","Desejados","Favoritos","Capturados"};
    	
    	for(int i=0;i<4;i++) {
        	this.jtp.addTab(listaStr[i], paineis.get(i).criaScrollPane());
    		
    	}
    	
    }
}