/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokedex;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author caio
 */
public class Aplicacao {
	
    public static void main(String args[]) throws SQLException{
    	new StyleInterface();
		TelaInicial wn = new TelaInicial();
		wn.criaAbas();
    	wn.setVisible(true);
        
    }
}
