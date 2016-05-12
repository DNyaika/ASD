package state.labSoln;

public class Wet implements State {
	CarController carController;

	public Wet(CarController carController) {
		super();
		this.carController = carController;
	}

	@Override
	public int left() {
		return 4;
	}

	@Override
	public int accel() {
		return 9;
	}

	@Override
	public int right() {
		return 4;
	}

	@Override
	public int brake() {
		return 7;
	}

	public String toString() {
		return ("wet");
	}
}
