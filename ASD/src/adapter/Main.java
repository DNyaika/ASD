package adapter;

public class Main {
	public static void main(String[] args) {
		TargetStack ts = new Adapter();
		ts.push("David");
		ts.push("Samuel");
		ts.push("solomon");
		ts.push("yo");
		System.out.println(ts.pop());
		System.out.println(ts.pop());
		System.out.println(ts.pop());
		System.out.println(ts.pop());
		System.out.println(ts.isEmpty());
		System.out
				.println("===========================================================");
		TargetQueue tq = new Adapter();
		tq.add("David");
		tq.add("Samuel");
		tq.add("solomon");
		tq.add("yo");
		System.out.println(tq.remove());
		System.out.println(tq.remove());
		System.out.println(tq.remove());
		System.out.println(tq.remove());

	}
}
