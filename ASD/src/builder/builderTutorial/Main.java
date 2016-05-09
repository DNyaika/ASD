package builder.builderTutorial;

import builder.builderTutorial.model.Car;

public class Main {

	public static void main(String[] args) {
		CarBuilder build = new UsCarBuilder();
		Director direct = new Director(build);
		direct.build();
		Car car = build.getCar();
		System.out.println(car);
	}	
}
