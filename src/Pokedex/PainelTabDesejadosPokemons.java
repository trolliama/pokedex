package Pokedex;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.sql.SQLException;

import javax.swing.JPanel;

public class PainelTabDesejadosPokemons extends Paineis implements Painel{
	
	private int idUsuario;
	private JPanel painelTemporarioBL;
	private JPanel painelTemporarioFL;
	private ListaDePokemons pkLista;

	public PainelTabDesejadosPokemons(Dimension dimension,int idUsuario) throws SQLException {
		super(dimension);
		
		this.idUsuario = idUsuario;
		pkLista = new ListaDePokemons(new DesejadosUsuarioDAO().selecionaPokemonFromCapturadosByUsuario(idUsuario));
	}
	
	public void criaBotoes(Image img, Pokemon poke) {
		
		this.painelTemporarioBL.add(new Botoes().criaJButtonPokemon(img, poke), BorderLayout.CENTER);
		this.painelTemporarioFL.add(new Botoes().criaBotaoAddFavoritos(poke));
		this.painelTemporarioFL.add(new Botoes().criaBotaoAddCapturados(poke, this.idUsuario));
		this.painelTemporarioFL.add(new Botoes().criaBotaoAddDesejos(poke));
		
	}
	
	public void listaOsPokemons(){
    	System.out.println("k");
    	String caminhoImg = "../imagensPokemon/";
    	
    	for(int i=0;i<50;i++) {
    	for(Pokemon poke: this.pkLista.getLista()) {
    		this.painelTemporarioBL = criaPainelTemporarioBorderLayout();
    		add(this.painelTemporarioBL);
    		this.painelTemporarioFL = criaPainelTemporarioFlowLayout();
    		this.painelTemporarioBL.add(this.painelTemporarioFL, BorderLayout.SOUTH);
    		
    		Image img = new Imagem(caminhoImg+poke.getId()+".png", 140, 140).getNewImg();
    		criaBotoes(img, poke);;
    	}
    	}
    }
}
