/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokedex;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

/**
 *
 * @author caio
 */
@SuppressWarnings("serial")
public class TelaInicial extends JFrame{
    
	private JPanel painelInicial,painelTemporarioBL,painelTemporarioFL;
	private JScrollPane scrollPane;
	private ArrayList<Pokemon> pokemonLista;
	private Dimension dimension;
	private String cpfUsuarioAtual;
	private int idUsuario;
	
    public TelaInicial(ArrayList<Pokemon> pokemonLista){
        super("Pokédex");
        
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setSizeJFrame();
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new BorderLayout());
        
        Pokemon poke = this.pokemonLista.get(2-1);
        System.out.println(poke.getNome());
        System.out.println(this.pokemonLista);
       
    }
    
    public void setSizeJFrame() {
    	DisplayMode tamanho = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
    	int width = (int) (tamanho.getWidth()/1.7);
    	int height = (int) (tamanho.getHeight()/1.1);
    	this.dimension = new Dimension(width, height);
    	
    	this.setSize(this.dimension);
    }
    
    public void criaScrollPane() {
    	this.scrollPane = new JScrollPane(this.painelInicial);
    	this.scrollPane.setViewportView(this.painelInicial);
        
    	this.add(this.scrollPane, BorderLayout.CENTER);
    }
    
    public void criaPainelInicial() {
    	System.out.println("q");
    	this.painelInicial = new JPanel();
        int width = (int) (this.dimension.getWidth());
        System.out.println(this.pokemonLista.size());
    	this.painelInicial.setPreferredSize(new Dimension( width,50*100));
    }
    
    public JPanel criaPainelTemporarioBorderLayout() {
    	this.painelTemporarioBL = new JPanel();
    	this.painelTemporarioBL.setLayout(new BorderLayout());
    	
    	return this.painelTemporarioBL;
    }
    
    public void criaPainelTemporarioFlowLayout() {

    	this.painelTemporarioFL = new JPanel();
    	
    	this.painelTemporarioBL.add(this.painelTemporarioFL, BorderLayout.SOUTH);
    }
    
    public void criaBotoes(Image img, Pokemon poke) {

		this.painelTemporarioBL.add(new Botoes().criaJButtonPokemon(img, poke));
		this.painelTemporarioFL.add(new Botoes().criaBotaoAddFavoritos(poke));
		this.painelTemporarioFL.add(new Botoes().criaBotaoAddCapturados(poke, this.idUsuario));
		this.painelTemporarioFL.add(new Botoes().criaBotaoAddDesejos(poke));
		
    }
    
    public void listaPokemons(){
    	System.out.println("k");
    	String caminhoImg = "../imagensPokemon/";
    	
    	for(int i=0;i<50;i++) {
    	for(Pokemon poke: this.pokemonLista) {
    		this.painelInicial.add(criaPainelTemporarioBorderLayout());
    		criaPainelTemporarioFlowLayout();
    		
    		Image img = new Imagem(caminhoImg+poke.getId()+".png", 140, 140).getNewImg();
    		criaBotoes(img, poke);
    	}
    	}
    }
}
