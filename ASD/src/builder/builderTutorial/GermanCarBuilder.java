package builder.builderTutorial;

import builder.builderTutorial.model.Car;

public class GermanCarBuilder implements CarBuilder {
	Car car;

	@Override
	public String makeEnginee(String enginee) {

		return "Engine Type" + enginee;
	}

	@Override
	public String paint(String paint) {
		return "Color paint" + paint;
	}

	@Override
	public String makeTyre() {
		return "8 tyres attached";
	}

	public void makeCar() {
		car = new Car();
		car.setEnginee(this.makeEnginee("German"));
		car.setTyre(this.makeTyre());
		car.setPaint(this.paint("Red"));
	}

	@Override
	public Car getCar() {
		return car;
	}

}
