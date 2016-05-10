package memento.classExample;

public class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	String getState() {
		return state;
	}
}
