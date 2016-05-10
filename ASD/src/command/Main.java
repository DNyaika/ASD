package command;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		SquareController controller = new SquareController();
		Square square = new Square(4, 0);
		Command MoveRightBy3Command = new MoveRightBy3Command(square);
		Command create5Command = new Create5Command(square);
		Command scale2Command = new Scale2Command(square);
		
		controller.setCommand(MoveRightBy3Command);
		controller.commandInitiated();
		controller.setCommand(create5Command);
		controller.commandInitiated();
		controller.setCommand(scale2Command);
		controller.commandInitiated();
	}
}
