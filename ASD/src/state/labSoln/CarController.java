package state.labSoln;

public class CarController {
	private State gravelState;
	private State iceState;
	private State regularState;
	private State wetState;

	State state = regularState;

	public CarController() {
		gravelState = new Gravel(this);
		iceState = new Ice(this);
		regularState = new Regular(this);
		wetState = new Wet(this);
	}

	public int left() {
		return state.left();
	}

	public int accel() {
		return state.accel();
	}

	public int right() {
		return state.right();
	}

	public int brake() {
		return state.brake();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getGravelState() {
		return gravelState;
	}

	public State getIceState() {
		return iceState;
	}

	public State getRegularState() {
		return regularState;
	}

	public State getWetState() {
		return wetState;
	}
}
