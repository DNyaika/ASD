package iterator.prob1;

public class Main {
	public static void main(String args[]) {
		Aggregate aggregate = new NameRepository();
		Iterator iterator = aggregate.getIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
