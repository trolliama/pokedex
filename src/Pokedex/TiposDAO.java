package Pokedex;

import java.sql.*;

/* ########################################################
 * ATENÇÃO ATENÇÃO ATENÇÃO ATENÇÃO ATENÇÃO#################
 * ATENÇÃO, ESSA CLASSE NÃO ESTÁ EM USO   #################
 * ATENÇÃO ATENÇÃO ATENÇÃO ATENÇÃO ATENÇÃO#################
 * ########################################################
 */

public class TiposDAO {
	
	private Connection con;
	public TiposDAO() {
		this.con = new ConnectionFactory().getConnection();
	}
	
	public String selecionaFromTiposById(int id) throws SQLException{
		
		try {
			Statement stmt = this.con.createStatement();
			String sqlStatement = String.format("select tipo from tipos where id = %d", id);
			ResultSet rs = stmt.executeQuery(sqlStatement);
			
			while(rs.next()) {
				return rs.getString("tipo");
			}
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			this.con.close();
		}
		return "";
	}
}
