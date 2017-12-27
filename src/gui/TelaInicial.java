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
import java.awt.Font;
import pokedex.Imagem;

/**
 *
 * @author caio
 */
@SuppressWarnings("serial")
public class TelaInicial extends JFrame{
    
	private Dimension dimension;
	private int idUsuario;
	private JTabbedPane jtp;
	private ListaDePokemons pkLista;
	private ArrayList<PaineisInformacoesDoUsuario> paineis = new ArrayList<PaineisInformacoesDoUsuario>();
	private GridBagConstraints c;
	private Paineis painelAll;
	
    public TelaInicial(int idUsuario) throws SQLException{
        super("Pokédex");
        
        this.idUsuario = idUsuario;
        
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
    	this.painelAll = new Paineis("Pokémons",this.dimension,this.pkLista );
    	
        String[] listaNomes = {"Desejos","Favoritos","Capturados"};
    	for(String nome:listaNomes) {
            this.paineis.add(new PaineisInformacoesDoUsuario(nome, this.dimension, this.pkLista));
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
            adicionaExtras(painel);
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
        
        adicionaExtras(painel);
    }
    
    public void addOnTabPane() {
    	this.jtp.addTab(painelAll.getNomeAba(), painelAll.criaScrollPane());
    	
    	for(PaineisInformacoesDoUsuario painel:paineis) {
        	this.jtp.addTab(painel.getNomeAba(), painel.criaScrollPane());
    		
    	}
    	
    }
    
    private void mensagemDoPikachu(PaineisInformacoesDoUsuario painel){
        
        JPanel painelBL = new JPanel(new BorderLayout());
        
        int width = (int) this.dimension.getWidth()/5;
        int height = (int) this.dimension.getHeight()/5;
        
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        
        ImageIcon icon;
        icon = new ImageIcon(new Imagem().setNewImg(true,"PikachuSentado",height, width));
        String frase = "Desculpe você ainda não tem pokemos adicionados nos "+painel.getNomeAba();
        
        JLabel label = new JLabel(frase,icon,JLabel.CENTER);
        label.setFont(new Font("SansSerif",Font.PLAIN, (int) this.dimension.getWidth()/45));
        label.setVerticalTextPosition(JLabel.BOTTOM);
        
        painelBL.add(label);
        
        painel.add(painelBL);
    }

    private void adicionaExtras(PaineisInformacoesDoUsuario painel) {
        
        int width = (int) Math.floor(this.dimension.getWidth()/168);
        
        if(painel.getComponentCount() == 0 ){
            mensagemDoPikachu(painel);
        }
        if (painel.getComponentCount() <= width) {
            System.out.println(painel.getComponentCount());
            painel.add(new JPanel(), this.c);
        }
    }
}