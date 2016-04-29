package factory.invetory;

public class ConsoleTrace implements Trace {
	private Boolean debug = true;

	@Override
	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	@Override
	public void debug(String message) {
		if (debug)
			System.out.println("Debug: " + message);

	}

	@Override
	public void error(String message) {
		if (debug)
			System.out.println("Error: " + message);

	}

}
