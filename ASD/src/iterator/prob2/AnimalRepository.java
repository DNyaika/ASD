package iterator.prob2;

import iterator.prob2.factory.MammalIteratorFactory;

public class AnimalRepository implements Aggregate {
	private String animals[][] = new String[][] { { "monkey" }, { "Lion" },
			{ "Giraffe" }, { "Cheater" }, { "Leopard" }, { "Zebra" } };

	@Override
	public Iterator getIterator() {
		return MammalIteratorFactory.getFactory().createIterator("animal");
	}

	public String[][] getAnimalss() {
		return animals;
	}
}
