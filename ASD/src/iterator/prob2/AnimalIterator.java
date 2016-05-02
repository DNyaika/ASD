package iterator.prob2;

public class AnimalIterator implements Iterator {
	String[][] animals = new AnimalRepository().getAnimalss();

	int index;

	@Override
	public boolean hasNext() {

		if (index < animals.length) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		String value = "";
		if (this.hasNext() && !animals[index][0].equals("-")) {
			value = animals[index][0];
			index++;
			return value;
		} else if (this.hasNext()) {
			value = animals[(index) + 1][0];
			index++;
			return value;
		}
		return null;
	}
}
