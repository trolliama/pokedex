package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import pokedex.Imagem;
import pokedex.Pokemon;


public class Paineis extends JPanel{

	private Dimension dimension;

	private PainelBorderLayout painelTemporarioBL;
	private int x,y;
	private int columns;
	
	public Paineis(Dimension dimension) {

        this.dimension = dimension;
        
        this.x = 0;
        this.y = 0;
        
        this.columns = (int) Math.floor(this.dimension.getWidth()/168);
        setLayout(new GridBagLayout());
        
	}
        
        public void zeraXY(){
            this.x = 0;
            this.y = 0;
        }
        
        public void setXY(int x, int y){
            this.x = x;
            this.y = y;
        }
	
	public void acrescentaXY() {
		if(this.x == this.columns-1) {
			this.x = 0;
			this.y += 1;
			
		}else {
			this.x+=1;
		}
	}
	
	public void configuraConstraint() {
		this.getPainelTemporarioBL().setC(new GridBagConstraints(), x, y);
	}
	
	public JScrollPane criaScrollPane() {
		
            JScrollPane scrollPane = new JScrollPane(this);
            scrollPane.setViewportView(this);

            int width = (int) this.dimension.getWidth();
            int height = (int) this.dimension.getHeight() - 64;
            
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            
            scrollPane.setPreferredSize(new Dimension(width, height));
        
    	return scrollPane;
    }
	
	public void addPaineis() {
            
            System.out.println(this.getPainelTemporarioBL().getC().gridx+","+this.getPainelTemporarioBL().getC().gridy);
            
            add(this.getPainelTemporarioBL(),this.getPainelTemporarioBL().getC());
		
	}
        
	public PainelBorderLayout getPainelTemporarioBL() {
		return painelTemporarioBL;
	}

	public void setPainelTemporarioBL(PainelBorderLayout painelTemporarioBL) {
		this.painelTemporarioBL = painelTemporarioBL;
	}
        
        public void listaOsPokemons(Pokemon poke, int idUsuario, TelaInicial tela, ArrayList<PaineisInformacoesDoUsuario> paineis) throws SQLException{
            Image img = new Imagem().setNewImg(poke.getId(), 140, 140);
	
            JPanel pnl = getPainelTemporarioBL().criaBotoes(img, poke, idUsuario, tela, paineis);
            getPainelTemporarioBL().criaTemporarioBoxLayout(poke.getNome(), pnl);
            
	}
	
}