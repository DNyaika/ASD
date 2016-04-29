package factory.main;

import factory.invetory.Trace;
import factory.manufature.DebuggerFactory;
import factory.manufature.SimpleDebuggerFactory;

/**
 * “trace.log” to choose the FileTrace, “console” for the ConsoleTrace
 */
public class Main {

	public static void main(String[] args) {
		DebuggerFactory factory = SimpleDebuggerFactory.getDebuggerFactory();
		Trace trace = factory.createDebugger(args[0]);
		trace.setDebug(true);
		trace.debug("reaching here");
		trace.error("Runtime exception occured");
	}
}
