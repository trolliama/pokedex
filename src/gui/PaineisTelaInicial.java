package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import pokedex.Imagem;
import pokedex.Pokemon;

public class PaineisTelaInicial extends JPanel{

	private Dimension dimension;

	private JPanel painelTemporarioBL, painelTemporarioFL;
	private int x,y;
	private GridBagConstraints c;
	private int columns;
	
	public PaineisTelaInicial(Dimension dimension, int idUsuario) {

        this.dimension = dimension;
        
        this.x = 0;
        this.y = 0;
        
        this.columns = (int) Math.floor(this.dimension.getWidth()/168);
        setLayout(new GridBagLayout());
        
	}
	
	public void atualizar(Pokemon poke,int ind, int idUsuario, GridBagConstraints c, JPanel comp, TelaInicial tela) throws SQLException {
		
		this.c = c;
		
		remove(comp);
		listaOsPokemons(poke, idUsuario, tela);
		addPaineis();
	}
	
	public void acrescentaXY() {
		if(this.x == this.columns-1) {
			this.x = 0;
			this.y += 1;
			
		}else {
			this.x+=1;
		}
	}
	public JScrollPane criaScrollPane() {
		
		JScrollPane scrollPane = new JScrollPane(this);
		scrollPane.setViewportView(this);
		
		int width = (int) this.dimension.getWidth();
		int height = (int) this.dimension.getHeight() - 64;
		
		scrollPane.setPreferredSize(new Dimension(width, height));
        
    	return scrollPane;
    }
	
	public void criaPainelTemporarioFlowLayout() {
		this.painelTemporarioFL = new JPanel();
	}
	
	public void criaPainelTemporarioBorderLayout() {
    	this.painelTemporarioBL = new JPanel();
    	this.painelTemporarioBL.setLayout(new BorderLayout());
    }
	
	public void criaBotoes(Image img, Pokemon poke, int idUsuario,TelaInicial tela) throws SQLException{
		Botoes bts = new Botoes(tela);
		
		this.painelTemporarioBL.add(bts.criaJButtonPokemon(img, poke), BorderLayout.CENTER);
		this.painelTemporarioFL.add(bts.criaBotaoAddFavoritos(poke, idUsuario, this.c, this.painelTemporarioBL));
		this.painelTemporarioFL.add(bts.criaBotaoAddCapturados(poke, idUsuario, this.c));
		this.painelTemporarioFL.add(bts.criaBotaoAddDesejos(poke, idUsuario, this.c));
		
	}
	
	public void addPaineis() {

		this.painelTemporarioBL.add(this.painelTemporarioFL, BorderLayout.SOUTH);
		add(this.painelTemporarioBL,this.c);
		
	}
	
	public void addPaineis(int indicePosic) {
		this.painelTemporarioBL.add(this.painelTemporarioFL, BorderLayout.SOUTH);
		add(this.painelTemporarioBL,indicePosic);
	}
	
	public void configuraConstraint() {
		this.c = new GridBagConstraints();
		
		this.c.anchor = GridBagConstraints.FIRST_LINE_START;
		
		this.c.insets = new Insets(12,13,13,12);
		
		this.c.gridx = this.x;
		this.c.gridy = this.y;
		
		this.c.weighty = y;
		
	}
	public void listaOsPokemons(Pokemon poke, int idUsuario,TelaInicial tela) throws SQLException{
		
		acrescentaXY();
    	
    	Image img = new Imagem().setNewImg(poke.getId(), 140, 140);

		criaPainelTemporarioBorderLayout();
		criaPainelTemporarioFlowLayout();
		
		criaBotoes(img, poke, idUsuario,tela);
	}
}