/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;
import java.sql.*;

import gui.StyleInterface;
import login.TelaLoginD2;

/**
 *
 * @author caio
 */
public class Aplicacao {
	
    public static void main(String args[]) throws SQLException{
        new StyleInterface();
        new TelaLoginD2();
        
    }
}
