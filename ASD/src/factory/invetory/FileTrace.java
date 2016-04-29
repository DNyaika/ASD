package factory.invetory;

import factory.util.FileWriterUtil;

public class FileTrace implements Trace {
	private Boolean debug = true;

	@Override
	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	@Override
	public void debug(String message) {
		if (debug)
			FileWriterUtil.writeToFile("Debug : " + message);
	}

	@Override
	public void error(String message) {
		if (debug)
			FileWriterUtil.writeToFile("Error : " + message);
	}

}
