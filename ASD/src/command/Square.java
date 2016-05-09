package command;

public class Square implements Cloneable {
	private int side;
	private int position;

	public Square(int side, int position) {
		super();
		this.side = side;
		this.position = position;
	}

	public void sacle2() {
		this.side = side * 2;
	}

	public void create5() {
		this.side = 5;
	}

	public void moveRightBy3() {
		this.position = 3;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", position=" + position + "]";
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getSide() {
		return side;
	}

	public int getPosition() {
		return position;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
}
