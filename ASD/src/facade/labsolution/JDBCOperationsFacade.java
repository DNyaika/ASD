package facade.labsolution;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCOperationsFacade implements IJDBCOperations {
	private JBDCOperations operations = new JBDCOperations();

	@Override
	public void registerDriver(String driver)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		operations.registerDriver(driver);
	}

	@Override
	public Connection getConnection(String database) throws SQLException {
		return operations.getConnection(database);
	}

	@Override
	public ResultSet getResultSet(String sql, Connection conn, int row, String columnValue) throws SQLException {

		return operations.getResultSet(sql, conn, row, columnValue);
	}

	@Override
	public CallableStatement getCallableStatement(String sql, Connection conn) throws SQLException {
		return operations.getCallableStatement(sql, conn);
	}

}
