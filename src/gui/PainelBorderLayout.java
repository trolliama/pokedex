package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JLabel;

import javax.swing.JPanel;

import pokedex.Pokemon;

public class PainelBorderLayout extends JPanel{
	
	private GridBagConstraints c;
	private JPanel painelTemporarioFL;

	public PainelBorderLayout() {
		setLayout(new BorderLayout());
		
		criaPainelTemporarioFlowLayout();
		
	}
	

	public void criaPainelTemporarioFlowLayout() {
		this.painelTemporarioFL = new JPanel();
		add(this.painelTemporarioFL, BorderLayout.SOUTH);
	}
	
	public void criaBotoes(Image img, Pokemon poke) {
                JLabel  lb = new JLabel(poke.getNome());
		lb.setFont(new Font("Dialog", Font.PLAIN, 18));
                lb.setAlignmentX(CENTER_ALIGNMENT);
                
                add(lb,BorderLayout.NORTH);
		add(new Botoes(null).criaJButtonPokemon(img, poke));
	}
	
	public void criaBotoes(Image img, Pokemon poke, int idUsuario,TelaInicial tela, ArrayList<PaineisInformacoesDoUsuario> paineis) throws SQLException{
		Botoes bts = new Botoes(tela);
                JLabel  lb = new JLabel(poke.getNome());
		lb.setFont(new Font("Dialog", Font.PLAIN, 18));
                lb.setAlignmentX(CENTER_ALIGNMENT);
                        
                add(lb,BorderLayout.NORTH);
		add(bts.criaJButtonPokemon(img, poke), BorderLayout.CENTER);
		this.painelTemporarioFL.add(bts.criaBotaoAddFavoritos(poke, idUsuario, paineis.get(1)));
		this.painelTemporarioFL.add(bts.criaBotaoAddCapturados(poke, idUsuario, this.getC()));
		this.painelTemporarioFL.add(bts.criaBotaoAddDesejos(poke, idUsuario, this.getC()));
		
	}

	public GridBagConstraints getC() {
		return c;
	}

	public void setC(GridBagConstraints c, int x, int y) {
		this.c = c;

		this.getC().anchor = GridBagConstraints.FIRST_LINE_START;
		
		
		this.getC().gridx = x;
		this.getC().gridy = y;
		
		this.getC().weighty = y;
	}
}
