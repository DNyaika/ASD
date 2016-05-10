package command;

public class Scale2Command implements Command {

	Square square;
	Square squareCopy;

	public Scale2Command(Square square) throws CloneNotSupportedException {
		this.square = square;
		squareCopy = (Square) square.clone();
	}

	@Override
	public void execute() {
		square.sacle2();

	}

	@Override
	public void undo() {
		int side = squareCopy.getSide() / 2;
		square.setSide(side);

	}

}
