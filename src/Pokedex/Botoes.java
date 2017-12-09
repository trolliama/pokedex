package Pokedex;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;


public class Botoes{

	public Image criaImagem(String caminho, int width, int height) {

    	ImageIcon img = new ImageIcon(getClass().getResource(caminho));
    	Image newImg = img.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
    	
    	return newImg;
    }
    
    public JButton criaJButtonPokemon(Image img, Pokemon poke) {
    	
    	JButton botaoPoke = new JButton();
        botaoPoke.setIcon(new ImageIcon(img));
        
        ActionListener callEspecPoke = new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.out.println(poke.getNome());
        	}
        };
        botaoPoke.addActionListener(callEspecPoke);
        
        /*botao.setHorizontalTextPosition(SwingConstants.CENTER);
        botao.setForeground(Color.WHITE);
        botao.setFont(new Font("Arial", Font.BOLD, 40));
        botao.setMargin(new Insets(0, 0, 0, 0));
        botao.setBorder(null);
        botao.setOpaque(false);
        botao.setContentAreaFilled(false);
        botao.setBorderPainted(false);
        */
        return botaoPoke;
    	
    }
    
    public JButton criaBotaoAddFavoritos(Pokemon poke) {

    	ActionListener acListener = new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			System.out.println("adicionado aos favoritos o pokemon: "+poke.getNome());
    		}
    	};
    	JButton btAddFavoritos = new JButton();
    	
    	/*btAddFavoritos.setHorizontalTextPosition(SwingConstants.CENTER);
        btAddFavoritos.setForeground(Color.WHITE);
        btAddFavoritos.setFont(new Font("Arial", Font.BOLD, 40));
        btAddFavoritos.setMargin(new Insets(0, 0, 0, 0));
        btAddFavoritos.setBorder(null);
        btAddFavoritos.setOpaque(false);
        btAddFavoritos.setContentAreaFilled(false);
        btAddFavoritos.setBorderPainted(false);*/
        
    	btAddFavoritos.setIcon(new ImageIcon(criaImagem("../imagensBotoes/nao-favorito.png", 20, 20)));
    	btAddFavoritos.setToolTipText("Adicionar aos Favoritos");
    	
    	btAddFavoritos.addActionListener(acListener);
    	
    	return btAddFavoritos;
    }
    
    public JButton criaBotaoAddCapturados(Pokemon poke) {
    	ActionListener acListener = new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			System.out.println("adicionado aos capturados o pokemon: "+poke.getNome());
    		}
    	};
    	
    	JButton btAddCapturados = new JButton();
    	
    	/*btAddCapturados.setHorizontalTextPosition(SwingConstants.CENTER);
        btAddCapturados.setForeground(Color.WHITE);
        btAddCapturados.setFont(new Font("Arial", Font.BOLD, 40));
        btAddCapturados.setMargin(new Insets(0, 0, 0, 0));
        btAddCapturados.setBorder(null);
        btAddCapturados.setOpaque(false);
        btAddCapturados.setContentAreaFilled(false);
        btAddCapturados.setBorderPainted(false);*/
        
    	btAddCapturados.setIcon(new ImageIcon(criaImagem("../imagensBotoes/nao-capturado.png", 20, 20)));
    	btAddCapturados.setToolTipText("Adicionar aos capturados");
    	
    	btAddCapturados.addActionListener(acListener);
    	
    	return btAddCapturados;
    }
    
    public JButton criaBotaoAddDesejos(Pokemon poke) {
    	ActionListener acListener = new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			System.out.println("adicionado aos desejados o pokemon: "+poke.getNome());
    		}
    	};
    	
    	JButton btAddDesejos = new JButton();
    	
    	/*btAddDesejos.setHorizontalTextPosition(SwingConstants.CENTER);
        btAddDesejos.setForeground(Color.WHITE);
        btAddDesejos.setFont(new Font("Arial", Font.BOLD, 40));
        btAddDesejos.setMargin(new Insets(0, 0, 0, 0));
        btAddDesejos.setBorder(null);
        btAddDesejos.setOpaque(false);
        btAddDesejos.setContentAreaFilled(false);
        btAddDesejos.setBorderPainted(false);*/
        
    	btAddDesejos.setIcon(new ImageIcon(criaImagem("../imagensBotoes/nao-desejado.png", 20, 20)));
    	btAddDesejos.setToolTipText("Adicionar nos desejados");
    	
    	btAddDesejos.addActionListener(acListener);
    	
    	return btAddDesejos;
    }
}
