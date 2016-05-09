package builder.builderLabSolution;

public class Main {
	public static void main(String[] args) {
		RequestDirector rd = new RequestDirector(new Agent());
		rd.constructRequest();
		Request request = rd.getRequest();
		System.out.println(request);
	}
}
