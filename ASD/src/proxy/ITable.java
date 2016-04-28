package proxy;

public interface ITable {
	public int numOfRows();

	public IRow getRow(int rowNum);

	public void addRow(Row row, int rowNum);

	public void modifyRow(int rowNum, Row row);

	public void deleteRow(int rowNum);
}
