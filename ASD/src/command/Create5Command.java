package command;

public class Create5Command implements Command {
	Square square;
	Square squareCopy;

	public Create5Command(Square square) throws CloneNotSupportedException {
		this.square = square;
		squareCopy = (Square) square.clone();
	}

	@Override
	public void execute() {
		square.create5();
	}

	@Override
	public void undo() {
		square.setSide(squareCopy.getSide());
	}

}
