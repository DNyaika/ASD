package state.labSoln;

public class Ice implements State {
	CarController carController;

	public Ice(CarController carController) {
		super();
		this.carController = carController;
	}

	@Override
	public int left() {
		return 1;
	}

	@Override
	public int accel() {
		return 3;
	}

	@Override
	public int right() {
		return 1;
	}

	@Override
	public int brake() {
		return 2;
	}

	public String toString() {
		return ("ice");
	}
}
