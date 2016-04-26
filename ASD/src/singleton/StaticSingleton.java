package singleton;

import org.w3c.dom.css.Counter;

public class StaticSingleton {
	private static StaticSingleton instance = new StaticSingleton();

	private StaticSingleton() {
	}

	public static synchronized StaticSingleton getInstance() {

			return instance;
	
	}
}
