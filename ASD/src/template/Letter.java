package template;

public abstract class Letter {
	public final void constructLetter() {
		construct();
	}

	public abstract String construct();

	public abstract  void print() ;


}
