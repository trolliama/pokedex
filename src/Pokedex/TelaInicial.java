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
	private int idUsuario;
	private JTabbedPane jtp;
	
    public TelaInicial() throws SQLException{
        super("Pokédex");
        
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setSizeJFrame();
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new BorderLayout());
        
        criaAbas();
    }
    
    public void setSizeJFrame() {
    	DisplayMode tamanho = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
    	int width = (int) (tamanho.getWidth()/1.7);
    	int height = (int) (tamanho.getHeight()/1.1);
    	this.dimension = new Dimension(width, height);
    	
    	this.setSize(this.dimension);
    }
    
    public void criaAbas() throws SQLException {
    	
    	this.jtp = new JTabbedPane();
        add(this.jtp,BorderLayout.NORTH);
        
        PainelTabAllPokemos painelTAP = new PainelTabAllPokemos(this.dimension);
        painelTAP.listaOsPokemons();
        this.jtp.addTab("Pokemons", painelTAP.criaScrollPane());
        
        PainelTabDesejadosPokemons painelTDP = new PainelTabDesejadosPokemons(this.dimension, this.idUsuario);
        painelTDP.listaOsPokemons();
        this.jtp.addTab("Desejados", painelTDP.criaScrollPane());
    }
}
