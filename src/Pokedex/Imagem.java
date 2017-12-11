/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokedex;

import javax.swing.ImageIcon;
import java.awt.Image;
/**
 *
 * @author aluno
 */
public class Imagem {
    
    private Image newImg;
    
    public Imagem(String caminho, int width, int height) {

    	ImageIcon img = new ImageIcon(getClass().getResource(caminho));
    	this.newImg = img.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
    }
    
    public Image getNewImg(){
        return this.newImg;
    }
   
}
