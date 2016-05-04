package flyweightclassexample;

import java.awt.Color;
import java.awt.Graphics;

public class Main1 {

	public static void main(String[] args) {
		Graphics g = panel.getGraphics();
		for (int i = 0; i < NUMBER_OF_LINES; ++i) {
		Color color = getRandomColor();
		ConcreteFlyweight line =
		flyweightFactory.getInstance(color);
		line.draw(g, "Hello", line.color, getRandomX(),
		getRandomY());
		}
	}

}
