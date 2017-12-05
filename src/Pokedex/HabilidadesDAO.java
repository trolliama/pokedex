package Pokedex;

import java.sql.*;

public class HabilidadesDAO {
	private Connection con;
	public HabilidadesDAO() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public String selecionaFromHabilidadesById(int id) throws SQLException{
		
		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select nome_habilidade from habilidades where id = %d", id);
			ResultSet rs = stmt.executeQuery(sqlStatement);
			
			while(rs.next()) {
				return rs.getString("nome_habilidade");
			}
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			this.con.close();
		}
		return "";
	}
}
