package flyweightclassexample;

import java.awt.Color;
import java.awt.Graphics;
/*
 * - declares an interface through which flyweights can
     receive and act on extrinsic state.
 */
public interface Flyweight {
	public void draw(Graphics g, String string,
			Color color, int x, int y);

}
