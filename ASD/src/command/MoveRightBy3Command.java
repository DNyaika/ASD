package command;

public class MoveRightBy3Command implements Command {
	Square square;

	public MoveRightBy3Command(Square square) {
		this.square = square;
	}

	@Override
	public void execute() {
		square.moveRightBy3();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
