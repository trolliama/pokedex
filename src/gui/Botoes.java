package gui;

import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import connections.CapturadosUsuarioDAO;
import connections.DesejadosUsuarioDAO;
import connections.FavoritosUsuarioDAO;
import pokedex.Imagem;
import pokedex.ListaDePokemons;
import pokedex.Pokemon;

public class Botoes{
    
	private TelaInicial tela;
	
	public Botoes(TelaInicial tela) {
		
		this.tela = tela;
		
	}
    public JButton criaJButtonPokemon(Image img, Pokemon poke) {
    	
    	JButton botaoPoke = new JButton();
        botaoPoke.setIcon(new ImageIcon(img));
        
        ActionListener callEspecPoke = new ActionListener() {
                @Override
        	public void actionPerformed(ActionEvent e) {
        		System.out.println(poke.getCategoria());
        	}
        };
        botaoPoke.addActionListener(callEspecPoke);
        
        return botaoPoke;
    	
    }
    
    public JButton criaBotaoAddFavoritos(Pokemon poke, int idUsuario,PaineisInformacoesDoUsuario painel) throws SQLException{
    	
    	JButton btAddFavoritos = new JButton();
    	
		btAddFavoritos.setIcon(new ImageIcon(new Imagem().setNewImg(new FavoritosUsuarioDAO().selecionaPokemonFromFavoritosByUserAndPoke(idUsuario, poke.getId()), "Favorito", 20, 20 )));
    	
    	
    	btAddFavoritos.setToolTipText("Adicionar/Retirar dos Favoritos");
    	
    	ActionListener acListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    boolean adicionado = new FavoritosUsuarioDAO().selecionaPokemonFromFavoritosByUserAndPoke(idUsuario, poke.getId());
    	    	
                    if(adicionado) {
                        adicionado = false;
                        new FavoritosUsuarioDAO().retiraPokemonEmFavoritos(poke.getId(), idUsuario);
                        btAddFavoritos.setIcon(new ImageIcon(new Imagem().setNewImg(adicionado, "Favorito", 20, 20 )));
    		    	
                        tela.retirarEspecifico( painel, new ListaDePokemons(new FavoritosUsuarioDAO().selecionaPokemonFromFavoritosByUsuario(idUsuario)));
                    }
                    else {
                        adicionado = true;
                        new FavoritosUsuarioDAO().inseriPokemonEmFavoritos(poke.getId(), idUsuario);
                        btAddFavoritos.setIcon(new ImageIcon(new Imagem().setNewImg(adicionado, "Favorito", 20, 20 )));
    		    	
                        tela.adicionarEspecifico(poke, painel, new ListaDePokemons(new FavoritosUsuarioDAO().selecionaPokemonFromFavoritosByUsuario(idUsuario)));
                    }
                    
                    tela.repaint();
				
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        };
    	
    	btAddFavoritos.addActionListener(acListener);
    	
    	return btAddFavoritos;
    }
    
    public JButton criaBotaoAddCapturados(Pokemon poke, int idUsuario, GridBagConstraints c) throws SQLException {
    	JButton btAddCapturados = new JButton();
        
    	btAddCapturados.setIcon(new ImageIcon(new Imagem().setNewImg( new CapturadosUsuarioDAO().selecionaPokemonFromCapturadosByUserAndPoke(idUsuario, poke.getId()), "Capturado", 20, 20 )));
    	btAddCapturados.setToolTipText("Adicionar/Retirar dos capturados");
    	
    	ActionListener acListener = new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			try {
    				boolean adicionado = new CapturadosUsuarioDAO().selecionaPokemonFromCapturadosByUserAndPoke(idUsuario, poke.getId());
    				
    				if(adicionado) {
    					adicionado = false;
    					new CapturadosUsuarioDAO().retiraPokemonEmCapturados(poke.getId(), idUsuario);
    					btAddCapturados.setIcon(new ImageIcon(new Imagem().setNewImg(adicionado, "Capturado", 20, 20 )));
    				}
    				else {
    					adicionado = true;
    					new CapturadosUsuarioDAO().inseriPokemonEmCapturados(poke.getId(), idUsuario);
    					btAddCapturados.setIcon(new ImageIcon(new Imagem().setNewImg(adicionado, "Capturado", 20, 20 )));
    				}
    				
    				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		}
    	};
    	
    	btAddCapturados.addActionListener(acListener);
    	
    	return btAddCapturados;
    }
    
    public JButton criaBotaoAddDesejos(Pokemon poke, int idUsuario, GridBagConstraints c) throws SQLException {
    	JButton btAddDesejos = new JButton();
        
    	btAddDesejos.setIcon(new ImageIcon(new Imagem().setNewImg(new DesejadosUsuarioDAO().selecionaPokemonFromDesejadosByUserAndPoke(idUsuario, poke.getId()), "Desejado", 20, 20 )));
    	btAddDesejos.setToolTipText("Adicionar/Retirar dos desejados");
    	
    	ActionListener acListener = new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			try {
    				boolean adicionado = new DesejadosUsuarioDAO().selecionaPokemonFromDesejadosByUserAndPoke(idUsuario, poke.getId());
    				
    				if(adicionado) {
    					adicionado = false;
    					new DesejadosUsuarioDAO().retiraPokemonEmDesejados(poke.getId(), idUsuario);
    					btAddDesejos.setIcon(new ImageIcon(new Imagem().setNewImg(adicionado, "Desejado", 20, 20 )));
    				}
    				else {
    					adicionado = true;
    					new DesejadosUsuarioDAO().inseriPokemonEmDesejados(poke.getId(), idUsuario);
    					btAddDesejos.setIcon(new ImageIcon(new Imagem().setNewImg(adicionado, "Desejado", 20, 20 )));
    				}
    				
    				
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
    		}
    	};
    	
    	btAddDesejos.addActionListener(acListener);
    	
    	return btAddDesejos;
    }
}