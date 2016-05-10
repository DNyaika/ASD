package facade.labsolution;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface IJDBCOperations {
	public void registerDriver(String driver) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
	public Connection getConnection(String database) throws SQLException;
	public ResultSet getResultSet(String sql, Connection conn,int row,String columnValue) throws SQLException;
	public CallableStatement getCallableStatement(String sql, Connection conn) throws SQLException;
}
