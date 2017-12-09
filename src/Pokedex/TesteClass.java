package Pokedex;

import java.sql.SQLException;

public class TesteClass {
	public static void main(String[] args) throws SQLException {
		try {
			new UsuarioDAO().selecionaFromUsuarioByLogin("kk");
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}
