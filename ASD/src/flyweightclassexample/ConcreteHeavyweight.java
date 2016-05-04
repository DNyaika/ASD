package flyweightclassexample;

import java.awt.Color;
import java.awt.Graphics;

/*
 * The Flyweight interface enables sharing; it doesn't
enforce it. It's common for UnsharedConcreteFlyweight
objects to have ConcreteFlyweight objects as children at
some level in the flyweight object structure.
 */
public class ConcreteHeavyweight {
	private Color color = null; // intrinsic state
	private String string = ""; // extrinsic state
	private int x, y; // extrinsic state

	public ConcreteHeavyweight(String string, Color color, int x, int y) {
		this.string = string;
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics g, String str, Color color, int i, int j) {
		g.setColor(color);
		g.drawString(string, x, y);

	}
}
