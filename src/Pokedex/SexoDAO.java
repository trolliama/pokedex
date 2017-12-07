package Pokedex;

import java.sql.*;

/* ########################################################
 * ATENÇÃO ATENÇÃO ATENÇÃO ATENÇÃO ATENÇÃO#################
 * ATENÇÃO, ESSA CLASSE NÃO ESTÁ EM USO   #################
 * ATENÇÃO ATENÇÃO ATENÇÃO ATENÇÃO ATENÇÃO#################
 * ########################################################
 */

public class SexoDAO {
	private Connection con = new ConnectionFactory().getConnection();
	
	public String selecionaFromTableSexoById(int id) throws SQLException {
		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select sexo from sexos where id = %d", id);
			ResultSet rs = stmt.executeQuery(sqlStatement);
			
			while(rs.next()) {
				return rs.getString("sexo");
			}
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			this.con.close();
		}
		
		return "";
	}
}
