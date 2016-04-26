package singleton;

public class Main {
	public static void main(String args[]) {
		

			Runnable run = () -> StaticSingleton.getInstance();//Singleton.getInstance();

			for (int i = 0; i < 10; i++) {
				new Thread(run).start();
			}
	}
}
