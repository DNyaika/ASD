package iterator.prob1;

public class NameRepository implements Aggregate {
	private String names[][] = new String[][] { { "Rob" }, { "Jon" },
			{ "Jul" }, { "Lor" }, { "Pat" }, { "Ken" } };

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
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
}
