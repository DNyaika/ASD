package iterator.prob2.factory;

import iterator.prob2.AnimalIterator;
import iterator.prob2.NameIterator;
import iterator.prob2.Iterator;

public class MammalIteratorFactory implements MammalIterator {
	private static MammalIterator factory = new MammalIteratorFactory();

	private MammalIteratorFactory() {
	}

	public static MammalIterator getFactory() {
		return factory;
	}

	@Override
	public Iterator createIterator(String type) {
		Iterator iterator = null;
		if (type.equals("name")) {
			iterator = new NameIterator();
		} else if (type.equals("animal")) {
			iterator = new AnimalIterator();
		}
		return iterator;
	}

}
