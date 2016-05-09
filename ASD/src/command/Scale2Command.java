package command;

public class Scale2Command implements Command {

	Square square;

	public Scale2Command(Square square) {
		this.square = square;
	}

	@Override
	public void execute() {
		square.sacle2();

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
