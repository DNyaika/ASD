package memento;

import java.util.ArrayList;

class Caretaker {

	// Where all mementos are saved

	ArrayList<Memento> savedProfiles = new ArrayList<Memento>();

	// Adds memento to the ArrayList

	public void addMemento(Memento m) {
		savedProfiles.add(m);
	}

	// Gets the memento requested from the ArrayList

	public Memento getMemento(int index) {
		if (savedProfiles.size() == 0)
			return null;
		return savedProfiles.get(index);
	}
}