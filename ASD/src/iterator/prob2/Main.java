package iterator.prob2;

public class Main {
	public static void main(String args[]) {
		Aggregate nameAggregate = new NameRepository();
		Aggregate animalAggregate = new AnimalRepository();
		Iterator nameIterator = nameAggregate.getIterator();
		Iterator animalIterator = animalAggregate.getIterator();
		System.out.println("================Names=================");
		print(nameIterator);
		System.out.println("================Animmals=================");
		print(animalIterator);
	}

	public static void print(Iterator iterator) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
