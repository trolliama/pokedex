package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import pokedex.ListaDePokemons;

import pokedex.Pokemon;

public class PainelBorderLayout extends JPanel{
	
    private GridBagConstraints c;
    private JPanel painelTemporarioBoxL;

	public PainelBorderLayout() {
		setLayout(new BorderLayout());
		
	}
	
        public void criaTemporarioBoxLayout(String nomePoke, JPanel painelFL) throws SQLException{
            JLabel lb = new JLabel(nomePoke);
            lb.setFont(new Font("SansSerif",Font.PLAIN, 16));
            lb.setHorizontalAlignment(SwingConstants.CENTER);
            
            this.painelTemporarioBoxL = new JPanel(new BorderLayout());
            
            this.painelTemporarioBoxL.add(lb,BorderLayout.NORTH);
            this.painelTemporarioBoxL.add(painelFL);
            
            add(this.painelTemporarioBoxL,BorderLayout.SOUTH);
        }

	public JPanel criaBotoes(Image img,ListaDePokemons listaPk, Pokemon poke, int idUsuario,TelaInicial tela, ArrayList<PaineisInformacoesDoUsuario> paineis) throws SQLException {
		Botoes bts = new Botoes(tela);
                JPanel painelTemporarioFL = new JPanel();
                
                add(bts.criaJButtonPokemon(img, poke,listaPk), BorderLayout.CENTER);
		painelTemporarioFL.add(bts.criaBotaoAddFavoritos(poke, idUsuario, paineis.get(1)));
		painelTemporarioFL.add(bts.criaBotaoAddCapturados(poke, idUsuario, paineis.get(2)));
		painelTemporarioFL.add(bts.criaBotaoAddDesejos(poke, idUsuario, paineis.get(0)));
                
                return painelTemporarioFL;
	}
	
	public void criaBotoes(Image img,ListaDePokemons listaPk, Pokemon poke) {
                JLabel  lb = new JLabel(poke.getNome());
		lb.setFont(new Font("Dialog", Font.PLAIN, 16));
                lb.setHorizontalAlignment(SwingConstants.CENTER);
                
                add(lb,BorderLayout.SOUTH);
		add(new Botoes(null).criaJButtonPokemon(img, poke, listaPk));
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
