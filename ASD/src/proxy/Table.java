package proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Scenario 3: A class library provides a Table class, but does not provide a
 * capability to allow clients to lock individual table rows. We do not have the
 * source code for this class library, but we have complete documentation and
 * know the interface of the Table class. How can we provide a row locking
 * capability for the Table class? Solution: A Synchronization Proxy, which uses
 * a locking mechanism to control the number of clients that simultaneously
 * access the server or the real object.
 */

public class Table implements ITable {
	Map<Integer, Row> rows;


	public Table() {
		rows = new HashMap<Integer, Row>();
	}

	@Override
	public int numOfRows() {
		return rows.size();
	}

	@Override
	public IRow getRow(int rowNum) {
			return rows.get(rowNum);

	}

	@Override
	public void addRow(Row row, int rowNum) {
		rows.put(rowNum, row);

	}

	@Override
	public void modifyRow(int rowNum, Row row) {
		rows.put(rowNum, row);
	}

	@Override
	public void deleteRow(int rowNum) {
		rows.put(rowNum, null);

	}

}
