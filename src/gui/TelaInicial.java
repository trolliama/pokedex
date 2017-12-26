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
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
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
	private ArrayList<PaineisInformacoesDoUsuario> paineis = new ArrayList<PaineisInformacoesDoUsuario>();
	private GridBagConstraints c;
	private Paineis painelAll;
	
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
    
    public void inicializaConstraint(){
        this.c = new GridBagConstraints();
    	
    	this.c.weightx = 1;
    	this.c.weighty = 1;
    	
    	this.c.fill = GridBagConstraints.BOTH;
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
    	this.painelAll = new Paineis(this.dimension );
    	
    	for(int i =1; i<4; i++) {
    		this.paineis.add(new PaineisInformacoesDoUsuario( this.dimension));
    		}
    }
    
    public void criaAbas() throws SQLException {
    	this.c = new GridBagConstraints();
    	
    	this.c.weightx = 1;
    	this.c.weighty = 1;
    	
    	this.c.fill = GridBagConstraints.BOTH;
    	
    	JPanel stretch = new JPanel();
    	for(Pokemon poke: pkLista.getLista()) {
            adicionarTodos(poke);

            this.painelAll.setPainelTemporarioBL(new PainelBorderLayout());
            this.painelAll.configuraConstraint();
            this.painelAll.listaOsPokemons(poke, this.idUsuario, this, this.paineis);
            this.painelAll.addPaineis();
            this.painelAll.acrescentaXY();
    		
    	}
    	
    	for(PaineisInformacoesDoUsuario painel: paineis) {
            adicionaStretch(painel);
        }
    }
    
    public void adicionarTodos(Pokemon poke) throws SQLException {
    	boolean [] bools = {new DesejadosUsuarioDAO().selecionaPokemonFromDesejadosByUserAndPoke(this.idUsuario, poke.getId()),
    			new FavoritosUsuarioDAO().selecionaPokemonFromFavoritosByUserAndPoke(this.idUsuario, poke.getId()),
    			new CapturadosUsuarioDAO().selecionaPokemonFromCapturadosByUserAndPoke(this.idUsuario, poke.getId())};
    	
    	for(int i=0;i<3;i++) {
    		if(bools[i]) {
    			paineis.get(i).setPainelTemporarioBL(new PainelBorderLayout());
    			paineis.get(i).configuraConstraint();
        		paineis.get(i).listaOsPokemons(poke);
        		paineis.get(i).addPaineis();
                        paineis.get(i).acrescentaXY();
    		}
    	}
    }
    
    public void adicionarEspecifico(Pokemon poke, PaineisInformacoesDoUsuario painel,ListaDePokemons pkLista) throws SQLException{
	    	
        if (painel.getComponentCount()- 1 <= (int) Math.floor(this.dimension.getWidth()/168)) {
            System.out.println("hahahahahahahahahaha");
            retirarEspecifico( painel, pkLista);
        }else{       
            painel.adicionarPokemon(poke);
        }
    }
    
    public void retirarEspecifico(PaineisInformacoesDoUsuario painel, ListaDePokemons pkLista) throws SQLException{
        painel.removeAll();
        painel.zeraXY();
        
        for(Pokemon poke:pkLista.getLista()){
            painel.setPainelTemporarioBL(new PainelBorderLayout());
            painel.configuraConstraint();
            painel.listaOsPokemons(poke);
            painel.addPaineis();
            painel.acrescentaXY();
        }
        
        adicionaStretch(painel);
    }
    
    public void addOnTabPane() {
    	String[] listaStr= {"Desejados","Favoritos","Capturados"};
    	this.jtp.addTab("Pokemons", painelAll.criaScrollPane());
    	
    	for(int i=0;i<3;i++) {
        	this.jtp.addTab(listaStr[i], paineis.get(i).criaScrollPane());
    		
    	}
    	
    }

    private void adicionaStretch(PaineisInformacoesDoUsuario painel) {
        
        int width = (int) Math.floor(this.dimension.getWidth()/168);
        
        if (painel.getComponentCount() <= width) {
            System.out.println(painel.getComponentCount());
            painel.add(new JPanel(), this.c);
        }
    }
}