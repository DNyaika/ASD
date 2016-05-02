package iterator.prob2;

import iterator.prob2.factory.MammalIteratorFactory;

public class NameRepository implements Aggregate {
	private String names[][] = new String[][] { { "Rob" }, { "Jon" },
			{ "Jul" }, { "Lor" }, { "Pat" }, { "Ken" } };

	@Override
	public Iterator getIterator() {
		return MammalIteratorFactory.getFactory().createIterator("name");
	}

	public String[][] getNames() {
		return names;
		
	}

}
