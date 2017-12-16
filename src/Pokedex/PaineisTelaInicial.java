package Pokedex;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Image;
import java.sql.SQLException;

public class PaineisTelaInicial extends JPanel{

	private Dimension dimension;

	private JPanel painelTemporarioBL;
	private JPanel painelTemporarioFL;
	private int idUsuario;

	public PaineisTelaInicial(Dimension dimension, int idUsuario) {

        this.dimension = dimension;
        
        int h = (int) Math.floor(this.dimension.getWidth()/168);
        setLayout(new GridLayout(0, h));
        
        this.idUsuario = idUsuario;
        
	}
	
	public JScrollPane criaScrollPane() {
		
		JScrollPane scrollPane = new JScrollPane(this);
		scrollPane.setViewportView(this);
		
		int width = (int) this.dimension.getWidth();
		int height = (int) this.dimension.getHeight() - 64;
		
		scrollPane.setPreferredSize(new Dimension(width, height));
        
    	return scrollPane;
    }
	
	public void criaPainelTemporarioBorderLayout() {
    	this.painelTemporarioBL = new JPanel();
    	this.painelTemporarioBL.setLayout(new BorderLayout());
    	
    }
	
	public void criaPainelTemporarioFlowLayout() {

    	this.painelTemporarioFL = new JPanel();
    	
    }
	
	public void criaBotoes(Image img, Pokemon poke) throws SQLException{
		
		this.painelTemporarioBL.add(new Botoes().criaJButtonPokemon(img, poke), BorderLayout.CENTER);
		this.painelTemporarioFL.add(new Botoes().criaBotaoAddFavoritos(poke, this.idUsuario,this.painelTemporarioFL, this));
		this.painelTemporarioFL.add(new Botoes().criaBotaoAddCapturados(poke, this.idUsuario, this.painelTemporarioFL));
		this.painelTemporarioFL.add(new Botoes().criaBotaoAddDesejos(poke, this.idUsuario, this.painelTemporarioFL));
		
	}
	
	public void listaOsPokemons(Pokemon poke) throws SQLException{
    	String caminhoImg = "../imagensPokemon/";
    	
    	Image img = new Imagem().setNewImg(caminhoImg+poke.getId(), 140, 140);
    	
		criaPainelTemporarioBorderLayout();
		add(this.painelTemporarioBL);
		criaPainelTemporarioFlowLayout();
		this.painelTemporarioBL.add(this.painelTemporarioFL, BorderLayout.SOUTH);
		
		
		criaBotoes(img, poke);
	}
   }
	
