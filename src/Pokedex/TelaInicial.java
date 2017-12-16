/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokedex;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;

/**
 *
 * @author caio
 */
@SuppressWarnings("serial")
public class TelaInicial extends JFrame{
    
	private Dimension dimension;
	private int idUsuario = 1;
	private JTabbedPane jtp;
	
    public TelaInicial() throws SQLException{
        super("Pokédex");
        
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setSizeJFrame();
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new BorderLayout());
        
    	this.jtp = new JTabbedPane();
        add(this.jtp,BorderLayout.NORTH);
       
    }
    
    public void setSizeJFrame() {
    	DisplayMode tamanho = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
    	int width = (int) (tamanho.getWidth()/1.7);
    	int height = (int) (tamanho.getHeight()/1.1);
    	this.dimension = new Dimension(width, height);
    	
    	this.setSize(this.dimension);
    }
    
    public void criaAbas() throws SQLException {
        
        criaAbaAllPokes();
        criaAbaDesejados();
        criaAbaFavoritos();
        criaAbaCapturados();
        
    }
    
    public void criaAbaAllPokes() throws SQLException {
    	PainelTabAllPokemos painelTAP = new PainelTabAllPokemos(this.dimension, this.idUsuario);
        this.jtp.addTab("Pokemons", painelTAP.criaScrollPane());
    }
    
    public void criaAbaDesejados() throws SQLException {
    	PainelTabDesejadosPokemons painelTDP = new PainelTabDesejadosPokemons(this.dimension, this.idUsuario);
        this.jtp.addTab("Desejados", painelTDP.criaScrollPane());
    }
    
    public void criaAbaFavoritos() throws SQLException {
    	PainelTabFavoritosPokemons painelTFP = new PainelTabFavoritosPokemons(this.dimension, this.idUsuario);
        this.jtp.addTab("Favoritos", painelTFP.criaScrollPane());
    }
    
    public void criaAbaCapturados() throws SQLException{
    	PainelTabCapturadosPokemons painelTCP = new PainelTabCapturadosPokemons(this.dimension, this.idUsuario);
    	this.jtp.addTab("Capturados", painelTCP.criaScrollPane());
    }
}
