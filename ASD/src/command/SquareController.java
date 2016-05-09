package command;

public class SquareController {
	Command command;

	public SquareController() {
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void commandInitiated() {
		command.execute();
	}
}
