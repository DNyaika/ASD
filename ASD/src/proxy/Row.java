package proxy;

import java.util.List;

public class Row implements IRow {
	List<Cell> cells;

	public Row(List<Cell> cells) {
		this.cells = cells;
	}

	public List<Cell> getCells() {
		return cells;
	}
}
