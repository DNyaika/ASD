package flyweightclassexample;

import java.awt.Color;
import java.awt.Graphics;

public class Main2 {
	public static void main(String... args) {
		Graphics g = panel.getGraphics();
		for (int i = 0; i < NUMBER_OF_LINES; ++i) {
			Color color = getRandomColor();
			ConcreteHeavyweight sh = new ConcreteHeavyweight(new String("Hello"), color, getRandomX(), getRandomY());
			sh.draw(g, "", color, 0, 0);
		}
	}

}
