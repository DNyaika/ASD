package state.labSoln;

public class Regular implements State {
	CarController carController;

	public Regular(CarController carController) {
		super();
		this.carController = carController;
	}

	@Override
	public int left() {
		return 5;
	}

	@Override
	public int accel() {
		return 9;
	}

	@Override
	public int right() {
		return 5;
	}

	@Override
	public int brake() {
		return 8;
	}

	public String toString() {
		return ("regular");
	}

}
