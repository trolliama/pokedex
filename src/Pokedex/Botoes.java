package Pokedex;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Botoes{
    
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
    
    public JButton criaBotaoAddFavoritos(Pokemon poke, int idUsuario, JPanel painel, PaineisTelaInicial obj) throws SQLException{
    	
    	boolean adicionado = new FavoritosUsuarioDAO().selecionaPokemonFromFavoritosByUserAndPoke(idUsuario, poke.getId());
    	System.out.println(adicionado);
    	
    	JButton btAddFavoritos = new JButton();
    	
		btAddFavoritos.setIcon(new ImageIcon(new Imagem().setNewImg(adicionado, "Favorito", 20, 20 )));
    	
    	
    	btAddFavoritos.setToolTipText("Adicionar/Retirar dos Favoritos");
    	
    	ActionListener acListener = new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			try {
    				if(adicionado) {
    					new FavoritosUsuarioDAO().retiraPokemonEmFavoritos(poke.getId(), idUsuario);
    					btAddFavoritos.setIcon(new ImageIcon(new Imagem().setNewImg(false, "Favorito", 20, 20 )));
    				}
    				else {
    					new FavoritosUsuarioDAO().inseriPokemonEmFavoritos(poke.getId(), idUsuario);
    					btAddFavoritos.setIcon(new ImageIcon(new Imagem().setNewImg(true, "Favorito", 20, 20 )));
    				}
    				
    				new TelaInicial().criaAbaFavoritos();
    				
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		}
    	};
    	
    	btAddFavoritos.addActionListener(acListener);
    	
    	return btAddFavoritos;
    }
    
    public JButton criaBotaoAddCapturados(Pokemon poke, int idUsuario, JPanel painel) throws SQLException {
    	JButton btAddCapturados = new JButton();
        
    	boolean adicionado = new CapturadosUsuarioDAO().selecionaPokemonFromCapturadosByUserAndPoke(idUsuario, poke.getId());
    	System.out.println("passei");
    	btAddCapturados.setIcon(new ImageIcon(new Imagem().setNewImg(adicionado, "Capturado", 20, 20 )));
    	btAddCapturados.setToolTipText("Adicionar/Retirar dos capturados");
    	
    	ActionListener acListener = new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			try {
    				if(adicionado) {
    					System.out.println("sss");
    					new CapturadosUsuarioDAO().retiraPokemonEmCapturados(poke.getId(), idUsuario);
    					System.out.println("aush");
    					btAddCapturados.setIcon(new ImageIcon(new Imagem().setNewImg(false, "Capturado", 20, 20 )));
    				}
    				else {
    					new CapturadosUsuarioDAO().inseriPokemonEmCapturados(poke.getId(), idUsuario);
    					btAddCapturados.setIcon(new ImageIcon(new Imagem().setNewImg(true, "Capturado", 20, 20 )));
    				}
    				
    				new TelaInicial().criaAbaCapturados();
    				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		}
    	};
    	
    	btAddCapturados.addActionListener(acListener);
    	
    	return btAddCapturados;
    }
    
    public JButton criaBotaoAddDesejos(Pokemon poke, int idUsuario, JPanel painel) throws SQLException {
    	JButton btAddDesejos = new JButton();
        
    	boolean adicionado = new DesejadosUsuarioDAO().selecionaPokemonFromDesejadosByUserAndPoke(idUsuario, poke.getId());
    	
    	btAddDesejos.setIcon(new ImageIcon(new Imagem().setNewImg(adicionado, "Desejado", 20, 20 )));
    	btAddDesejos.setToolTipText("Adicionar/Retirar dos desejados");
    	
    	ActionListener acListener = new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			try {
    				if(adicionado) {
    					new DesejadosUsuarioDAO().retiraPokemonEmDesejados(poke.getId(), idUsuario);
    					btAddDesejos.setIcon(new ImageIcon(new Imagem().setNewImg(false, "Desejado", 20, 20 )));
    				}
    				else {
    					new DesejadosUsuarioDAO().inseriPokemonEmDesejados(poke.getId(), idUsuario);
    					btAddDesejos.setIcon(new ImageIcon(new Imagem().setNewImg(true, "Desejado", 20, 20 )));
    				}
    				
    				new TelaInicial().criaAbaDesejados();
    				
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
    		}
    	};
    	
    	btAddDesejos.addActionListener(acListener);
    	
    	return btAddDesejos;
    }
}
