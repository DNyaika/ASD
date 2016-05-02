package iterator.prob2;

public class NameIterator implements Iterator {

	String[][] names = new NameRepository().getNames();
	int index;

	@Override
	public boolean hasNext() {

		if (index < names.length) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		String value = "";
		if (this.hasNext() && !names[index][0].equals("-")) {
			value = names[index][0];
			index++;
			return value;
		} else if (this.hasNext()) {
			value = names[(index) + 1][0];
			index++;
			return value;
		}
		return null;
	}
}
