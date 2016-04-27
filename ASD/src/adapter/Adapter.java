package adapter;

public class Adapter implements TargetStack, TargetQueue {
	private Adaptee adaptee = new Adaptee();
	private int start;

	@Override
	public void push(String str) {
		adaptee.add(str);
	}

	@Override
	public String pop() {
		int end = adaptee.getEnd();
		String str = adaptee.get(end);
		adaptee.remove(end);
		return str;
	}

	@Override
	public boolean isEmpty() {
		return adaptee.empty();
	}

	@Override
	public void add(String str) {
		adaptee.add(str);
	}

	@Override
	public String remove() {
		String str = adaptee.get(start);
		adaptee.remove(start);
		return str;
	}

}
