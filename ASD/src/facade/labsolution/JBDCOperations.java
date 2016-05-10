package facade.labsolution;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JBDCOperations {
	public void registerDriver(String driver)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Class.forName(driver).newInstance();
	}

	public Connection getConnection(String database) throws SQLException {
		return DriverManager.getConnection(database);
	}

	public ResultSet getResultSet(String sql, Connection conn,int row,String columnValue) throws SQLException {
		PreparedStatement prep = null;
		ResultSet rset = null;
		prep = conn.prepareStatement(sql);
		prep.setString(row, columnValue);
		rset = prep.executeQuery();
		return rset;
	}

	public CallableStatement getCallableStatement(String sql, Connection conn) throws SQLException {
		CallableStatement call;
		call = conn.prepareCall(sql);
		call.setInt(1, 1972);
		call.registerOutParameter(2, java.sql.Types.INTEGER);
		call.execute();
		return call;
	}
}
