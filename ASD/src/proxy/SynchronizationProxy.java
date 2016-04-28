package proxy;

public class SynchronizationProxy implements ITable {

	Table table;

	public SynchronizationProxy(Table table) {
		this.table = table;
	}

	@Override
	public int numOfRows() {
		return table.numOfRows();
	}

	@Override
	public IRow getRow(int rowNum) {
		synchronized (this) {
			return table.getRow(rowNum);
		}
	}

	@Override
	public void addRow(Row row, int rowNum) {
		table.addRow(row, rowNum);

	}

	@Override
	public void modifyRow(int rowNum, Row row) {
		synchronized (this) {
		table.modifyRow(rowNum, row);
		}

	}

	@Override
	public void deleteRow(int rowNum) {
		synchronized (this) {
			table.deleteRow(rowNum);
		}
	}
}
