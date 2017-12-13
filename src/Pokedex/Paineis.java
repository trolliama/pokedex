package Pokedex;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Paineis extends JPanel{

	private Dimension dimension;

	public Paineis(Dimension dimension) {

        this.dimension = dimension;
        
        int h = (int) Math.floor(this.dimension.getWidth()/168);
        setLayout(new GridLayout(0, h));
        
	}
	
	public JScrollPane criaScrollPane() {
		
		JScrollPane scrollPane = new JScrollPane(this);
		scrollPane.setViewportView(this);
		
		int width = (int) this.dimension.getWidth();
		int height = (int) this.dimension.getHeight() - 64;
		
		scrollPane.setPreferredSize(new Dimension(width, height));
        
    	return scrollPane;
    }
	
	public JPanel criaPainelTemporarioBorderLayout() {
    	JPanel painelTemporarioBL = new JPanel();
    	painelTemporarioBL.setLayout(new BorderLayout());
    	
    	return painelTemporarioBL;
    }
	
	public JPanel criaPainelTemporarioFlowLayout() {

    	JPanel painelTemporarioFL = new JPanel();
    	
    	return painelTemporarioFL;
    }
	
}
