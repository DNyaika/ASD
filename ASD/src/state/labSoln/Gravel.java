package state.labSoln;

public class Gravel implements State {
	CarController carController;

	public Gravel(CarController carController) {
		super();
		this.carController = carController;
	}


	@Override
	public int left() {
		return 3;
	}

	@Override
	public int accel() {
		return 7;
	}

	@Override
	public int right() {
		return 3;
	}

	@Override
	public int brake() {
		return 6;
	}

	public String toString() {
		return ("gravel");
	}
}
