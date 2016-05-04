package flyweightclassexample;

import java.awt.Color;
import java.awt.Graphics;

/*
 * - implements the Flyweight interface and adds storage for
      intrinsic state, if any.
   - must be sharable. Any state it stores must be intrinsic.
 */
public class ConcreteFlyweight implements Flyweight {
	Color color; // only the intrinsic state

	public ConcreteFlyweight(Color color) {
		this.color = color;
	}

	public void draw(Graphics g, String string, Color color, int x, int y) {
		g.setColor(color);
		g.drawString(string, x, y);
	}
}
