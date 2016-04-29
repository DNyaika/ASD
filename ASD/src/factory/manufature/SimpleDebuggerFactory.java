package factory.manufature;

import factory.invetory.ConsoleTrace;
import factory.invetory.FileTrace;
import factory.invetory.Trace;

public class SimpleDebuggerFactory implements DebuggerFactory {
	private static DebuggerFactory simpleDebuggerFactory = new SimpleDebuggerFactory();
	
	private SimpleDebuggerFactory(){}
          
	public static DebuggerFactory getDebuggerFactory(){
		return simpleDebuggerFactory;
	}
	
	@Override
	public Trace createDebugger(String trace) {
	
		if(trace.equals("trace.log")){
			return new FileTrace();
		}
		if(trace.equals("console")){
			return new ConsoleTrace();
		}
		throw new IllegalArgumentException("Please provide the correct arguments");
	}

}
