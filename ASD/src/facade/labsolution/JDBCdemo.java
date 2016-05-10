package facade.labsolution;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCdemo {
	public static void main(String[] arg) {
		Connection conn = null;
		PreparedStatement prep = null;
		CallableStatement call = null;
		ResultSet rset = null;
		IJDBCOperations facade = new JDBCOperationsFacade();
		try {
			facade.registerDriver("<driver>");
			conn = facade.getConnection("<database>");
			rset = facade.getResultSet("SELECT * FROM <table> WHERE <column name> =?", conn, 1, "<column value>");
			if (rset.next()) {
				System.out.println(rset.getString("<column name"));
			}
			call = facade.getCallableStatement("{call <stored procedure>( ?, ? )}", conn);
			System.out.println(call.getInt(2));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} finally {
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			if (prep != null) {
				try {
					prep.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			if (call != null) {
				try {
					call.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}